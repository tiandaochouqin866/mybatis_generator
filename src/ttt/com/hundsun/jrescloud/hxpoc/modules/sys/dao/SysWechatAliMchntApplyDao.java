package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysWechatAliMchntApplyEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysWechatAliMchntApplyEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysWechatAliMchntApplyDao {
    long countByExample(SysWechatAliMchntApplyEntityExample example);

    int deleteByExample(SysWechatAliMchntApplyEntityExample example);

    int deleteByPrimaryKey(BigDecimal commonSerialNo);

    int insert(SysWechatAliMchntApplyEntity record);

    int insertSelective(SysWechatAliMchntApplyEntity record);

    List<SysWechatAliMchntApplyEntity> selectByExample(SysWechatAliMchntApplyEntityExample example);

    SysWechatAliMchntApplyEntity selectByPrimaryKey(BigDecimal commonSerialNo);

    int updateByExampleSelective(@Param("record") SysWechatAliMchntApplyEntity record, @Param("example") SysWechatAliMchntApplyEntityExample example);

    int updateByExample(@Param("record") SysWechatAliMchntApplyEntity record, @Param("example") SysWechatAliMchntApplyEntityExample example);

    int updateByPrimaryKeySelective(SysWechatAliMchntApplyEntity record);

    int updateByPrimaryKey(SysWechatAliMchntApplyEntity record);
}