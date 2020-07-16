package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TTradeClearEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TTradeClearEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTradeClearDao {
    long countByExample(TTradeClearEntityExample example);

    int deleteByExample(TTradeClearEntityExample example);

    int deleteByPrimaryKey(BigDecimal serialNo);

    int insert(TTradeClearEntity record);

    int insertSelective(TTradeClearEntity record);

    List<TTradeClearEntity> selectByExample(TTradeClearEntityExample example);

    TTradeClearEntity selectByPrimaryKey(BigDecimal serialNo);

    int updateByExampleSelective(@Param("record") TTradeClearEntity record, @Param("example") TTradeClearEntityExample example);

    int updateByExample(@Param("record") TTradeClearEntity record, @Param("example") TTradeClearEntityExample example);

    int updateByPrimaryKeySelective(TTradeClearEntity record);

    int updateByPrimaryKey(TTradeClearEntity record);
}