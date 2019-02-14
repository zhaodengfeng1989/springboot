package com.sitech.echn.springboot.service;


import com.sitech.echn.springboot.dao.model.MalltEnterpriceInfo;

import java.util.List;

/**
 * 查询企业楼宇信息等内容
 * @author zhaodf
 *
 */
public interface MalltEnterpriceInfoService {
	/**
	 * 根据企业片段信息查询企业楼宇信息等内容
	 * @param bo
	 * @return
	 */
	public List<MalltEnterpriceInfo> qryEnterpriceInfoLst(MalltEnterpriceInfo bo);
}
