package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TFundSerialCardEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TFundSerialCardEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFundSerialCardDao {
    long countByExample(TFundSerialCardEntityExample example);

    int deleteByExample(TFundSerialCardEntityExample example);

    int deleteByPrimaryKey(BigDecimal serialNo);

    int insert(TFundSerialCardEntity record);

    int insertSelective(TFundSerialCardEntity record);

    List<TFundSerialCardEntity> selectByExample(TFundSerialCardEntityExample example);

    TFundSerialCardEntity selectByPrimaryKey(BigDecimal serialNo);

    int updateByExampleSelective(@Param("record") TFundSerialCardEntity record, @Param("example") TFundSerialCardEntityExample example);

    int updateByExample(@Param("record") TFundSerialCardEntity record, @Param("example") TFundSerialCardEntityExample example);

    int updateByPrimaryKeySelective(TFundSerialCardEntity record);

    int updateByPrimaryKey(TFundSerialCardEntity record);
}