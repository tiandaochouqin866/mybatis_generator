package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TCheckApplyRecordEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TCheckApplyRecordEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCheckApplyRecordDao {
    long countByExample(TCheckApplyRecordEntityExample example);

    int deleteByExample(TCheckApplyRecordEntityExample example);

    int deleteByPrimaryKey(BigDecimal applySerialNo);

    int insert(TCheckApplyRecordEntity record);

    int insertSelective(TCheckApplyRecordEntity record);

    List<TCheckApplyRecordEntity> selectByExample(TCheckApplyRecordEntityExample example);

    TCheckApplyRecordEntity selectByPrimaryKey(BigDecimal applySerialNo);

    int updateByExampleSelective(@Param("record") TCheckApplyRecordEntity record, @Param("example") TCheckApplyRecordEntityExample example);

    int updateByExample(@Param("record") TCheckApplyRecordEntity record, @Param("example") TCheckApplyRecordEntityExample example);

    int updateByPrimaryKeySelective(TCheckApplyRecordEntity record);

    int updateByPrimaryKey(TCheckApplyRecordEntity record);
}