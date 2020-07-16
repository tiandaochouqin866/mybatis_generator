package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysUserEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysUserEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserDao {
    long countByExample(SysUserEntityExample example);

    int deleteByExample(SysUserEntityExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(SysUserEntity record);

    int insertSelective(SysUserEntity record);

    List<SysUserEntity> selectByExample(SysUserEntityExample example);

    SysUserEntity selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") SysUserEntity record, @Param("example") SysUserEntityExample example);

    int updateByExample(@Param("record") SysUserEntity record, @Param("example") SysUserEntityExample example);

    int updateByPrimaryKeySelective(SysUserEntity record);

    int updateByPrimaryKey(SysUserEntity record);
}