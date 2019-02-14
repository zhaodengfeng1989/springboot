package com.sitech.echn.springboot.controller;


import com.sitech.echn.springboot.common.RetInfo;
import com.sitech.echn.springboot.dao.model.MalltEnterpriceInfo;
import com.sitech.echn.springboot.service.MalltEnterpriceInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/enterpeiceInfo")
public class MalltEnterpriceInfoController {

    @Resource
    private MalltEnterpriceInfoService malltEnterpriceInfoService;
    Logger logger = LoggerFactory.getLogger(MalltEnterpriceInfoController.class);

    @RequestMapping(value = "/getEnterpeiceInfo",method = RequestMethod.POST)
    public RetInfo enterpriceInfoLst(@RequestBody MalltEnterpriceInfo bo){
        RetInfo retInfo = new RetInfo();
        List<MalltEnterpriceInfo> malltEnterpriceInfoBoLst=malltEnterpriceInfoService.qryEnterpriceInfoLst(bo);
        if(null!=malltEnterpriceInfoBoLst&&malltEnterpriceInfoBoLst.size()>0){
            logger.info("查询成功");
            retInfo.setRetCode("0000");
            retInfo.setRetMsg("查询成功!");
            retInfo.setObject(malltEnterpriceInfoBoLst);
        }else{
            retInfo.setRetCode("0001");
            retInfo.setRetMsg("查询失败!");
        }
        return retInfo;
    }
}
