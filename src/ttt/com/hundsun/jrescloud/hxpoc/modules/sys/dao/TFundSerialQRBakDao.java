package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TFundSerialQRBakEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TFundSerialQRBakEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFundSerialQRBakDao {
    long countByExample(TFundSerialQRBakEntityExample example);

    int deleteByExample(TFundSerialQRBakEntityExample example);

    int deleteByPrimaryKey(BigDecimal tradSerialNo);

    int insert(TFundSerialQRBakEntity record);

    int insertSelective(TFundSerialQRBakEntity record);

    List<TFundSerialQRBakEntity> selectByExample(TFundSerialQRBakEntityExample example);

    TFundSerialQRBakEntity selectByPrimaryKey(BigDecimal tradSerialNo);

    int updateByExampleSelective(@Param("record") TFundSerialQRBakEntity record, @Param("example") TFundSerialQRBakEntityExample example);

    int updateByExample(@Param("record") TFundSerialQRBakEntity record, @Param("example") TFundSerialQRBakEntityExample example);

    int updateByPrimaryKeySelective(TFundSerialQRBakEntity record);

    int updateByPrimaryKey(TFundSerialQRBakEntity record);
}