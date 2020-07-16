package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TFundSerialQREntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TFundSerialQREntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFundSerialQRDao {
    long countByExample(TFundSerialQREntityExample example);

    int deleteByExample(TFundSerialQREntityExample example);

    int deleteByPrimaryKey(BigDecimal tradSerialNo);

    int insert(TFundSerialQREntity record);

    int insertSelective(TFundSerialQREntity record);

    List<TFundSerialQREntity> selectByExample(TFundSerialQREntityExample example);

    TFundSerialQREntity selectByPrimaryKey(BigDecimal tradSerialNo);

    int updateByExampleSelective(@Param("record") TFundSerialQREntity record, @Param("example") TFundSerialQREntityExample example);

    int updateByExample(@Param("record") TFundSerialQREntity record, @Param("example") TFundSerialQREntityExample example);

    int updateByPrimaryKeySelective(TFundSerialQREntity record);

    int updateByPrimaryKey(TFundSerialQREntity record);
}