package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TCheckRecordExceptionHisEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TCheckRecordExceptionHisEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCheckRecordExceptionHisDao {
    long countByExample(TCheckRecordExceptionHisEntityExample example);

    int deleteByExample(TCheckRecordExceptionHisEntityExample example);

    int deleteByPrimaryKey(BigDecimal exceptionSerialNo);

    int insert(TCheckRecordExceptionHisEntity record);

    int insertSelective(TCheckRecordExceptionHisEntity record);

    List<TCheckRecordExceptionHisEntity> selectByExample(TCheckRecordExceptionHisEntityExample example);

    TCheckRecordExceptionHisEntity selectByPrimaryKey(BigDecimal exceptionSerialNo);

    int updateByExampleSelective(@Param("record") TCheckRecordExceptionHisEntity record, @Param("example") TCheckRecordExceptionHisEntityExample example);

    int updateByExample(@Param("record") TCheckRecordExceptionHisEntity record, @Param("example") TCheckRecordExceptionHisEntityExample example);

    int updateByPrimaryKeySelective(TCheckRecordExceptionHisEntity record);

    int updateByPrimaryKey(TCheckRecordExceptionHisEntity record);
}