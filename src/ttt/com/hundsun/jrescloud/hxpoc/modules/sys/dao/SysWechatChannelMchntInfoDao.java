package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysWechatChannelMchntInfoEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysWechatChannelMchntInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysWechatChannelMchntInfoDao {
    long countByExample(SysWechatChannelMchntInfoEntityExample example);

    int deleteByExample(SysWechatChannelMchntInfoEntityExample example);

    int deleteByPrimaryKey(String wechatChannelId);

    int insert(SysWechatChannelMchntInfoEntity record);

    int insertSelective(SysWechatChannelMchntInfoEntity record);

    List<SysWechatChannelMchntInfoEntity> selectByExample(SysWechatChannelMchntInfoEntityExample example);

    SysWechatChannelMchntInfoEntity selectByPrimaryKey(String wechatChannelId);

    int updateByExampleSelective(@Param("record") SysWechatChannelMchntInfoEntity record, @Param("example") SysWechatChannelMchntInfoEntityExample example);

    int updateByExample(@Param("record") SysWechatChannelMchntInfoEntity record, @Param("example") SysWechatChannelMchntInfoEntityExample example);

    int updateByPrimaryKeySelective(SysWechatChannelMchntInfoEntity record);

    int updateByPrimaryKey(SysWechatChannelMchntInfoEntity record);
}