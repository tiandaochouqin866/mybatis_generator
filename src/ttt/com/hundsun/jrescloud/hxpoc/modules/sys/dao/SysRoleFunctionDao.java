package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysRoleFunctionEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysRoleFunctionEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleFunctionDao {
    long countByExample(SysRoleFunctionEntityExample example);

    int deleteByExample(SysRoleFunctionEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRoleFunctionEntity record);

    int insertSelective(SysRoleFunctionEntity record);

    List<SysRoleFunctionEntity> selectByExample(SysRoleFunctionEntityExample example);

    SysRoleFunctionEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRoleFunctionEntity record, @Param("example") SysRoleFunctionEntityExample example);

    int updateByExample(@Param("record") SysRoleFunctionEntity record, @Param("example") SysRoleFunctionEntityExample example);

    int updateByPrimaryKeySelective(SysRoleFunctionEntity record);

    int updateByPrimaryKey(SysRoleFunctionEntity record);
}