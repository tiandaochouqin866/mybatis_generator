package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysUserRoleEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysUserRoleEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserRoleDao {
    long countByExample(SysUserRoleEntityExample example);

    int deleteByExample(SysUserRoleEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserRoleEntity record);

    int insertSelective(SysUserRoleEntity record);

    List<SysUserRoleEntity> selectByExample(SysUserRoleEntityExample example);

    SysUserRoleEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserRoleEntity record, @Param("example") SysUserRoleEntityExample example);

    int updateByExample(@Param("record") SysUserRoleEntity record, @Param("example") SysUserRoleEntityExample example);

    int updateByPrimaryKeySelective(SysUserRoleEntity record);

    int updateByPrimaryKey(SysUserRoleEntity record);
}