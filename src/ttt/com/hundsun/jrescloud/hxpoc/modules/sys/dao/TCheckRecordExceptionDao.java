package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TCheckRecordExceptionEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TCheckRecordExceptionEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCheckRecordExceptionDao {
    long countByExample(TCheckRecordExceptionEntityExample example);

    int deleteByExample(TCheckRecordExceptionEntityExample example);

    int deleteByPrimaryKey(BigDecimal exceptionSerialNo);

    int insert(TCheckRecordExceptionEntity record);

    int insertSelective(TCheckRecordExceptionEntity record);

    List<TCheckRecordExceptionEntity> selectByExample(TCheckRecordExceptionEntityExample example);

    TCheckRecordExceptionEntity selectByPrimaryKey(BigDecimal exceptionSerialNo);

    int updateByExampleSelective(@Param("record") TCheckRecordExceptionEntity record, @Param("example") TCheckRecordExceptionEntityExample example);

    int updateByExample(@Param("record") TCheckRecordExceptionEntity record, @Param("example") TCheckRecordExceptionEntityExample example);

    int updateByPrimaryKeySelective(TCheckRecordExceptionEntity record);

    int updateByPrimaryKey(TCheckRecordExceptionEntity record);
}