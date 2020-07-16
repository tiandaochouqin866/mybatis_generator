package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysFunctionEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysFunctionEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFunctionDao {
    long countByExample(SysFunctionEntityExample example);

    int deleteByExample(SysFunctionEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysFunctionEntity record);

    int insertSelective(SysFunctionEntity record);

    List<SysFunctionEntity> selectByExample(SysFunctionEntityExample example);

    SysFunctionEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysFunctionEntity record, @Param("example") SysFunctionEntityExample example);

    int updateByExample(@Param("record") SysFunctionEntity record, @Param("example") SysFunctionEntityExample example);

    int updateByPrimaryKeySelective(SysFunctionEntity record);

    int updateByPrimaryKey(SysFunctionEntity record);
}