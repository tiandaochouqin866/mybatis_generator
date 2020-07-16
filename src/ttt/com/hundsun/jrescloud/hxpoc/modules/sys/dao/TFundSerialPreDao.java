package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TFundSerialPreEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TFundSerialPreEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFundSerialPreDao {
    long countByExample(TFundSerialPreEntityExample example);

    int deleteByExample(TFundSerialPreEntityExample example);

    int deleteByPrimaryKey(BigDecimal tradSerialNo);

    int insert(TFundSerialPreEntity record);

    int insertSelective(TFundSerialPreEntity record);

    List<TFundSerialPreEntity> selectByExample(TFundSerialPreEntityExample example);

    TFundSerialPreEntity selectByPrimaryKey(BigDecimal tradSerialNo);

    int updateByExampleSelective(@Param("record") TFundSerialPreEntity record, @Param("example") TFundSerialPreEntityExample example);

    int updateByExample(@Param("record") TFundSerialPreEntity record, @Param("example") TFundSerialPreEntityExample example);

    int updateByPrimaryKeySelective(TFundSerialPreEntity record);

    int updateByPrimaryKey(TFundSerialPreEntity record);
}