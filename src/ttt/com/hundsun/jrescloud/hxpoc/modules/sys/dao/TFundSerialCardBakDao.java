package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TFundSerialCardBakEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TFundSerialCardBakEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFundSerialCardBakDao {
    long countByExample(TFundSerialCardBakEntityExample example);

    int deleteByExample(TFundSerialCardBakEntityExample example);

    int deleteByPrimaryKey(BigDecimal serialNo);

    int insert(TFundSerialCardBakEntity record);

    int insertSelective(TFundSerialCardBakEntity record);

    List<TFundSerialCardBakEntity> selectByExample(TFundSerialCardBakEntityExample example);

    TFundSerialCardBakEntity selectByPrimaryKey(BigDecimal serialNo);

    int updateByExampleSelective(@Param("record") TFundSerialCardBakEntity record, @Param("example") TFundSerialCardBakEntityExample example);

    int updateByExample(@Param("record") TFundSerialCardBakEntity record, @Param("example") TFundSerialCardBakEntityExample example);

    int updateByPrimaryKeySelective(TFundSerialCardBakEntity record);

    int updateByPrimaryKey(TFundSerialCardBakEntity record);
}