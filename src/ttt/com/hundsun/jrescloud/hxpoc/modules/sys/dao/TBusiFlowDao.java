package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TBusiFlowEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TBusiFlowEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBusiFlowDao {
    long countByExample(TBusiFlowEntityExample example);

    int deleteByExample(TBusiFlowEntityExample example);

    int deleteByPrimaryKey(Long busiFlowNo);

    int insert(TBusiFlowEntity record);

    int insertSelective(TBusiFlowEntity record);

    List<TBusiFlowEntity> selectByExample(TBusiFlowEntityExample example);

    TBusiFlowEntity selectByPrimaryKey(Long busiFlowNo);

    int updateByExampleSelective(@Param("record") TBusiFlowEntity record, @Param("example") TBusiFlowEntityExample example);

    int updateByExample(@Param("record") TBusiFlowEntity record, @Param("example") TBusiFlowEntityExample example);

    int updateByPrimaryKeySelective(TBusiFlowEntity record);

    int updateByPrimaryKey(TBusiFlowEntity record);
}