package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TBusiFlowConfEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TBusiFlowConfEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBusiFlowConfDao {
    long countByExample(TBusiFlowConfEntityExample example);

    int deleteByExample(TBusiFlowConfEntityExample example);

    int deleteByPrimaryKey(Long flowConfNo);

    int insert(TBusiFlowConfEntity record);

    int insertSelective(TBusiFlowConfEntity record);

    List<TBusiFlowConfEntity> selectByExample(TBusiFlowConfEntityExample example);

    TBusiFlowConfEntity selectByPrimaryKey(Long flowConfNo);

    int updateByExampleSelective(@Param("record") TBusiFlowConfEntity record, @Param("example") TBusiFlowConfEntityExample example);

    int updateByExample(@Param("record") TBusiFlowConfEntity record, @Param("example") TBusiFlowConfEntityExample example);

    int updateByPrimaryKeySelective(TBusiFlowConfEntity record);

    int updateByPrimaryKey(TBusiFlowConfEntity record);
}