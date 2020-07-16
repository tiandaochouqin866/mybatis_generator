package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysPhotoEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysPhotoEntityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPhotoDao {
    long countByExample(SysPhotoEntityExample example);

    int deleteByExample(SysPhotoEntityExample example);

    int deleteByPrimaryKey(BigDecimal photoCode);

    int insert(SysPhotoEntity record);

    int insertSelective(SysPhotoEntity record);

    List<SysPhotoEntity> selectByExample(SysPhotoEntityExample example);

    SysPhotoEntity selectByPrimaryKey(BigDecimal photoCode);

    int updateByExampleSelective(@Param("record") SysPhotoEntity record, @Param("example") SysPhotoEntityExample example);

    int updateByExample(@Param("record") SysPhotoEntity record, @Param("example") SysPhotoEntityExample example);

    int updateByPrimaryKeySelective(SysPhotoEntity record);

    int updateByPrimaryKey(SysPhotoEntity record);
}