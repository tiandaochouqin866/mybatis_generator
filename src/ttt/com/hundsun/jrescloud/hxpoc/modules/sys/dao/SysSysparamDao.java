package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysSysparamEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysSysparamEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSysparamDao {
    long countByExample(SysSysparamEntityExample example);

    int deleteByExample(SysSysparamEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysSysparamEntity record);

    int insertSelective(SysSysparamEntity record);

    List<SysSysparamEntity> selectByExample(SysSysparamEntityExample example);

    SysSysparamEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysSysparamEntity record, @Param("example") SysSysparamEntityExample example);

    int updateByExample(@Param("record") SysSysparamEntity record, @Param("example") SysSysparamEntityExample example);

    int updateByPrimaryKeySelective(SysSysparamEntity record);

    int updateByPrimaryKey(SysSysparamEntity record);
}