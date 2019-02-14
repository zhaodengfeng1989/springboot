package com.sitech.echn.springboot.dao.api;

import com.sitech.echn.springboot.dao.model.MalltEnterpriceInfo;

import java.util.List;


public interface MalltEnterpriceInfoDao {

    int deleteByPrimaryKey(Integer id);

    int insert(MalltEnterpriceInfo record);

    int insertSelective(MalltEnterpriceInfo record);

    List<MalltEnterpriceInfo> selectByPrimaryKey(MalltEnterpriceInfo info);

    int updateByPrimaryKeySelective(MalltEnterpriceInfo record);

    int updateByPrimaryKey(MalltEnterpriceInfo record);

    List<String> selectCacheBuildingLst();
}