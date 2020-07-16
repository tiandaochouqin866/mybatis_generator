package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.UpMerchantBatchInfoEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.UpMerchantBatchInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpMerchantBatchInfoDao {
    long countByExample(UpMerchantBatchInfoEntityExample example);

    int deleteByExample(UpMerchantBatchInfoEntityExample example);

    int deleteByPrimaryKey(Long upBatchId);

    int insert(UpMerchantBatchInfoEntity record);

    int insertSelective(UpMerchantBatchInfoEntity record);

    List<UpMerchantBatchInfoEntity> selectByExample(UpMerchantBatchInfoEntityExample example);

    UpMerchantBatchInfoEntity selectByPrimaryKey(Long upBatchId);

    int updateByExampleSelective(@Param("record") UpMerchantBatchInfoEntity record, @Param("example") UpMerchantBatchInfoEntityExample example);

    int updateByExample(@Param("record") UpMerchantBatchInfoEntity record, @Param("example") UpMerchantBatchInfoEntityExample example);

    int updateByPrimaryKeySelective(UpMerchantBatchInfoEntity record);

    int updateByPrimaryKey(UpMerchantBatchInfoEntity record);
}