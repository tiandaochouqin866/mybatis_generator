package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TCommonTradSerialEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TCommonTradSerialEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCommonTradSerialDao {
    long countByExample(TCommonTradSerialEntityExample example);

    int deleteByExample(TCommonTradSerialEntityExample example);

    int deleteByPrimaryKey(BigDecimal commonSerialNo);

    int insert(TCommonTradSerialEntity record);

    int insertSelective(TCommonTradSerialEntity record);

    List<TCommonTradSerialEntity> selectByExample(TCommonTradSerialEntityExample example);

    TCommonTradSerialEntity selectByPrimaryKey(BigDecimal commonSerialNo);

    int updateByExampleSelective(@Param("record") TCommonTradSerialEntity record, @Param("example") TCommonTradSerialEntityExample example);

    int updateByExample(@Param("record") TCommonTradSerialEntity record, @Param("example") TCommonTradSerialEntityExample example);

    int updateByPrimaryKeySelective(TCommonTradSerialEntity record);

    int updateByPrimaryKey(TCommonTradSerialEntity record);
}