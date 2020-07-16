package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysDictEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysDictEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictDao {
    long countByExample(SysDictEntityExample example);

    int deleteByExample(SysDictEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysDictEntity record);

    int insertSelective(SysDictEntity record);

    List<SysDictEntity> selectByExample(SysDictEntityExample example);

    SysDictEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysDictEntity record, @Param("example") SysDictEntityExample example);

    int updateByExample(@Param("record") SysDictEntity record, @Param("example") SysDictEntityExample example);

    int updateByPrimaryKeySelective(SysDictEntity record);

    int updateByPrimaryKey(SysDictEntity record);
}