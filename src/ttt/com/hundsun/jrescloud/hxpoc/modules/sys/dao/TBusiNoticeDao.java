package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TBusiNoticeEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.TBusiNoticeEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBusiNoticeDao {
    long countByExample(TBusiNoticeEntityExample example);

    int deleteByExample(TBusiNoticeEntityExample example);

    int deleteByPrimaryKey(Long busiFlowNo);

    int insert(TBusiNoticeEntity record);

    int insertSelective(TBusiNoticeEntity record);

    List<TBusiNoticeEntity> selectByExample(TBusiNoticeEntityExample example);

    TBusiNoticeEntity selectByPrimaryKey(Long busiFlowNo);

    int updateByExampleSelective(@Param("record") TBusiNoticeEntity record, @Param("example") TBusiNoticeEntityExample example);

    int updateByExample(@Param("record") TBusiNoticeEntity record, @Param("example") TBusiNoticeEntityExample example);

    int updateByPrimaryKeySelective(TBusiNoticeEntity record);

    int updateByPrimaryKey(TBusiNoticeEntity record);
}