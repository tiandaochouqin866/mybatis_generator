package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysFeeConfigEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysFeeConfigEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFeeConfigDao {
    long countByExample(SysFeeConfigEntityExample example);

    int deleteByExample(SysFeeConfigEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysFeeConfigEntity record);

    int insertSelective(SysFeeConfigEntity record);

    List<SysFeeConfigEntity> selectByExample(SysFeeConfigEntityExample example);

    SysFeeConfigEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysFeeConfigEntity record, @Param("example") SysFeeConfigEntityExample example);

    int updateByExample(@Param("record") SysFeeConfigEntity record, @Param("example") SysFeeConfigEntityExample example);

    int updateByPrimaryKeySelective(SysFeeConfigEntity record);

    int updateByPrimaryKey(SysFeeConfigEntity record);
}