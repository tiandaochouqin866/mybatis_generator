package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysMchntMaintenanceRecordEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysMchntMaintenanceRecordEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMchntMaintenanceRecordDao {
    long countByExample(SysMchntMaintenanceRecordEntityExample example);

    int deleteByExample(SysMchntMaintenanceRecordEntityExample example);

    int deleteByPrimaryKey(BigDecimal commonSerialNo);

    int insert(SysMchntMaintenanceRecordEntity record);

    int insertSelective(SysMchntMaintenanceRecordEntity record);

    List<SysMchntMaintenanceRecordEntity> selectByExample(SysMchntMaintenanceRecordEntityExample example);

    SysMchntMaintenanceRecordEntity selectByPrimaryKey(BigDecimal commonSerialNo);

    int updateByExampleSelective(@Param("record") SysMchntMaintenanceRecordEntity record, @Param("example") SysMchntMaintenanceRecordEntityExample example);

    int updateByExample(@Param("record") SysMchntMaintenanceRecordEntity record, @Param("example") SysMchntMaintenanceRecordEntityExample example);

    int updateByPrimaryKeySelective(SysMchntMaintenanceRecordEntity record);

    int updateByPrimaryKey(SysMchntMaintenanceRecordEntity record);
}