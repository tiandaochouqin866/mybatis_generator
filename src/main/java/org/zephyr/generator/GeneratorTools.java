package org.zephyr.generator;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.TableConfiguration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 对于mybatis generator源码有部分改动，以适配生成的需求
 * 搜索zephyr add start即可找出源码改动处
 */
public class GeneratorTools {

    private static final String mydir= "D:\\ZRCB_GENERATOR";
    private static final String CONSOLE_CONFIG = "/src/main/resources/ConsoleGeneratorConfig.xml";
    private static final String MOBILE_CONFIG = "/src/main/resources/MobileGeneratorConfig.xml";
    private static final String ORDER_CONFIG = "/src/main/resources/OrderGeneratorConfig.xml";
    private static final String BATCH_CONFIG = "/src/main/resources/BatchGeneratorConfig.xml";
    private static final String CASHIER_CONFIG = "/src/main/resources/CashierGeneratorConfig.xml";

    private static final String BRANCH_CONFIG = "/src/main/resources/BranchConfig.xml";

    public static void main(String[] args) {
        shell();
    }

    private static void shell() {
        List<String> warnings = new ArrayList<>();
        // 使用通用的配置 generatorConfig.xml
        Context defaultContext = getDefaultContext(warnings);

        // 对于每个模块执行一次
       // codeGenerator(warnings, defaultContext, CONSOLE_CONFIG);
       // codeGenerator(warnings, defaultContext, MOBILE_CONFIG);
        codeGenerator(warnings, defaultContext, BRANCH_CONFIG);
        //codeGenerator(warnings, defaultContext, BATCH_CONFIG);
    }

    /**
     * 生成代码
     * @param path 配置文件路径
     */
    private static void codeGenerator(List<String> warnings, Context defaultContext, String path) {
        try {
            System.out.println("代码生成开始");
            //String configFilePath = System.getProperty("user.dir").concat(path);
            String configFilePath = mydir + path;
            System.out.println("加载配置文件，路径：" + configFilePath);
            File configFile = new File(configFilePath);
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            copyContext(defaultContext, config.getContexts().get(0));

            DefaultShellCallback callback = new DefaultShellCallback(true);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            ProgressCallback progressCallback = new VerboseProgressCallback();

            myBatisGenerator.generate(progressCallback);
            System.out.println("代码生成结束");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            for (String warning : warnings) {
                System.out.println(warning);
            }
        }
    }

    /**
     * 获取公共配置
     */
    private static Context getDefaultContext(List<String> warnings) {
        Context defaultContext = null;
        try {
            String configFilePath = mydir + ("/src/main/resources/generatorConfig.xml");
            System.out.println("加载公共配置文件，路径：" + configFilePath);
            File configFile = new File(configFilePath);
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            defaultContext = config.getContexts().get(0);
            System.out.println("加载公共配置文件完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defaultContext;
    }

    /**
     * 复制配置
     * @param defaultContext 公共配置
     * @param config 新配置
     */
    private static void copyContext(Context defaultContext, Context config) {
        config.setJdbcConnectionConfiguration(defaultContext.getJdbcConnectionConfiguration());
        config.setConnectionFactoryConfiguration(defaultContext.getConnectionFactoryConfiguration());
        config.setJavaTypeResolverConfiguration(defaultContext.getJavaTypeResolverConfiguration());

        // 检查是否配置了默认schema
        ArrayList<TableConfiguration> tableConfigurations = (ArrayList<TableConfiguration>) defaultContext.getTableConfigurations();
        if (StringUtils.isNotBlank(tableConfigurations.get(0).getSchema()) && StringUtils.isBlank(tableConfigurations.get(0).getTableName())) {
            String schema = tableConfigurations.get(0).getSchema();
            tableConfigurations.remove(0);
            for (TableConfiguration tableConfiguration : tableConfigurations) {
                tableConfiguration.setSchema(schema);
            }
        }

        config.setTableConfigurations(tableConfigurations);
        config.setDefaultModelType(defaultContext.getDefaultModelType());
        config.setBeginningDelimiter(defaultContext.getBeginningDelimiter());
        config.setEndingDelimiter(defaultContext.getEndingDelimiter());
        config.setCommentGeneratorConfiguration(defaultContext.getCommentGeneratorConfiguration());
        config.setCommentGenerator(defaultContext.getCommentGenerator());
        config.setPluginAggregator(defaultContext.getPluginAggregator());
        config.setPluginConfigurations(defaultContext.getPluginConfigurations());
        config.setTargetRuntime(defaultContext.getTargetRuntime());
        config.setIntrospectedColumnImpl(defaultContext.getIntrospectedColumnImpl());
        config.setAutoDelimitKeywords(defaultContext.getAutoDelimitKeywords());
        config.setJavaFormatter(defaultContext.getJavaFormatter());
        config.setXmlFormatter(defaultContext.getXmlFormatter());
    }
}

