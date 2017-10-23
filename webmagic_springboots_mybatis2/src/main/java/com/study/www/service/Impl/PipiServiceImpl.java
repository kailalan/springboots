package com.study.www.service.Impl;

import com.study.www.entity.PipiUpDownExplain;
import com.study.www.mapper.PipiUpDownEntityMapper;
import com.study.www.mapper.PipiUpDownExplainMapper;
import com.study.www.service.PipiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PipiServiceImpl: 入库服务的实现
 *
 * @auther : Administrator.zhuyanpeng
 * @date : 2017/7/25    18:01
 **/
@Service(value = "PipiService")
public class PipiServiceImpl implements PipiService{

    @Autowired
    private PipiUpDownEntityMapper pipiUpDownEntityMapper;
    @Autowired
    private PipiUpDownExplainMapper pipiUpDownExplainMapper;
    @Override
    public void savePipiData(List<PipiUpDownExplainMapper> pipiUpDownExplainMappers, PipiUpDownExplain pipiUpDownExplain) {
        pipiUpDownEntityMapper.insert(pipiUpDownExplainMappers);
        pipiUpDownExplainMapper.insert(pipiUpDownExplain);
    }
}
