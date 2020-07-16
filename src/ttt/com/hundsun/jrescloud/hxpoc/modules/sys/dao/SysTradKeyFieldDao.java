package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTradKeyFieldEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTradKeyFieldEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTradKeyFieldDao {
    long countByExample(SysTradKeyFieldEntityExample example);

    int deleteByExample(SysTradKeyFieldEntityExample example);

    int deleteByPrimaryKey(Short transCode);

    int insert(SysTradKeyFieldEntity record);

    int insertSelective(SysTradKeyFieldEntity record);

    List<SysTradKeyFieldEntity> selectByExample(SysTradKeyFieldEntityExample example);

    SysTradKeyFieldEntity selectByPrimaryKey(Short transCode);

    int updateByExampleSelective(@Param("record") SysTradKeyFieldEntity record, @Param("example") SysTradKeyFieldEntityExample example);

    int updateByExample(@Param("record") SysTradKeyFieldEntity record, @Param("example") SysTradKeyFieldEntityExample example);

    int updateByPrimaryKeySelective(SysTradKeyFieldEntity record);

    int updateByPrimaryKey(SysTradKeyFieldEntity record);
}