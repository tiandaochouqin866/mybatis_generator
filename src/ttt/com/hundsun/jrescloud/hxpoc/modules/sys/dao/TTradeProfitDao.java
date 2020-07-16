package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TTradeProfitEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TTradeProfitEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTradeProfitDao {
    long countByExample(TTradeProfitEntityExample example);

    int deleteByExample(TTradeProfitEntityExample example);

    int deleteByPrimaryKey(BigDecimal profitSerialNo);

    int insert(TTradeProfitEntity record);

    int insertSelective(TTradeProfitEntity record);

    List<TTradeProfitEntity> selectByExample(TTradeProfitEntityExample example);

    TTradeProfitEntity selectByPrimaryKey(BigDecimal profitSerialNo);

    int updateByExampleSelective(@Param("record") TTradeProfitEntity record, @Param("example") TTradeProfitEntityExample example);

    int updateByExample(@Param("record") TTradeProfitEntity record, @Param("example") TTradeProfitEntityExample example);

    int updateByPrimaryKeySelective(TTradeProfitEntity record);

    int updateByPrimaryKey(TTradeProfitEntity record);
}