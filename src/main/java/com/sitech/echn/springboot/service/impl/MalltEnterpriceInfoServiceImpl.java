package com.sitech.echn.springboot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.sitech.echn.springboot.dao.api.MalltEnterpriceInfoDao;
import com.sitech.echn.springboot.dao.model.MalltEnterpriceInfo;
import com.sitech.echn.springboot.service.MalltEnterpriceInfoService;
import org.springframework.stereotype.Service;

@Service("malltEnterpriceInfoService")
public class MalltEnterpriceInfoServiceImpl implements MalltEnterpriceInfoService {

	@Resource
	private MalltEnterpriceInfoDao malltEnterpriceInfoDao;

	@Override
	public List<MalltEnterpriceInfo> qryEnterpriceInfoLst(MalltEnterpriceInfo bo) {
		return malltEnterpriceInfoDao.selectByPrimaryKey(bo);
	}
}
