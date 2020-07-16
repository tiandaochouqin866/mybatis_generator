package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysRoleEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysRoleEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleDao {
    long countByExample(SysRoleEntityExample example);

    int deleteByExample(SysRoleEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRoleEntity record);

    int insertSelective(SysRoleEntity record);

    List<SysRoleEntity> selectByExample(SysRoleEntityExample example);

    SysRoleEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRoleEntity record, @Param("example") SysRoleEntityExample example);

    int updateByExample(@Param("record") SysRoleEntity record, @Param("example") SysRoleEntityExample example);

    int updateByPrimaryKeySelective(SysRoleEntity record);

    int updateByPrimaryKey(SysRoleEntity record);
}