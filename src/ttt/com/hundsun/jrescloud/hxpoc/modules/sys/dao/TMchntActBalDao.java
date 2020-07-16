package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TMchntActBalEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TMchntActBalEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMchntActBalDao {
    long countByExample(TMchntActBalEntityExample example);

    int deleteByExample(TMchntActBalEntityExample example);

    int deleteByPrimaryKey(BigDecimal serialNo);

    int insert(TMchntActBalEntity record);

    int insertSelective(TMchntActBalEntity record);

    List<TMchntActBalEntity> selectByExample(TMchntActBalEntityExample example);

    TMchntActBalEntity selectByPrimaryKey(BigDecimal serialNo);

    int updateByExampleSelective(@Param("record") TMchntActBalEntity record, @Param("example") TMchntActBalEntityExample example);

    int updateByExample(@Param("record") TMchntActBalEntity record, @Param("example") TMchntActBalEntityExample example);

    int updateByPrimaryKeySelective(TMchntActBalEntity record);

    int updateByPrimaryKey(TMchntActBalEntity record);
}