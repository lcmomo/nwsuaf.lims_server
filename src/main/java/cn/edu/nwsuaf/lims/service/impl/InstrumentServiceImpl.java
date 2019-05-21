package cn.edu.nwsuaf.lims.service.impl;

import cn.edu.nwsuaf.lims.dao.InstrumentMapper;
import cn.edu.nwsuaf.lims.model.Instrument;

import cn.edu.nwsuaf.lims.service.InstrumentService;
import cn.edu.nwsuaf.lims.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by liuchao Li on 2019/05/20.
 */
@Service
@Transactional
public class InstrumentServiceImpl extends AbstractService<Instrument> implements InstrumentService {
    @Resource
    private InstrumentMapper instrumentMapper;

    @Override
    public List<Instrument> findByPlatname(String platname) {
        Condition condition = new Condition(Instrument.class);
        condition.createCriteria()
                .andEqualTo("platname",platname);
        List<Instrument> list = findByCondition(condition);
        return list;
    }
}
