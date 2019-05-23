package cn.edu.nwsuaf.lims.service.impl;

import cn.edu.nwsuaf.lims.dao.AppointMapper;
import cn.edu.nwsuaf.lims.model.Appoint;
import cn.edu.nwsuaf.lims.service.AppointService;
import cn.edu.nwsuaf.lims.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Created by liuchao Li on 2019/05/22.
 */
@Service
@Transactional
public class AppointServiceImpl extends AbstractService<Appoint> implements AppointService {
    @Resource
    private AppointMapper appointMapper;

    @Override
    public List<Appoint> findByUsername(String username) {
        Condition condition = new Condition(Appoint.class);
        condition.createCriteria()
                .andEqualTo("username",username);
        List<Appoint> list=findByCondition(condition);

        return list;
    }

    @Override
    public List<Appoint> findByInstrumentAndTime(Appoint appoint)  {
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date start= null;
//        Date end=null;
//        try {
//            start = sdf.parse("2019-05-23 19:47:40");
//            end=sdf.parse("2019-05-23 23:59:59");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        appoint.setUseStarttime(start);
//        appoint.setUseEndtime(end);
//        appoint.setInstrName("人工气候箱");
        Condition condition = new Condition(Appoint.class);
        condition.createCriteria()
                .andBetween("useStarttime",appoint.getUseStarttime(),appoint.getUseEndtime())
                .orBetween("useEndtime",appoint.getUseStarttime(),appoint.getUseEndtime())
                .andEqualTo("instrName",appoint.getInstrName());
//        condition.createCriteria()
//                .andGreaterThanOrEqualTo("useStarttime",appoint.getUseStarttime())
//                .orLessThanOrEqualTo("useEndtime",appoint.getUseStarttime())
//                .andEqualTo("instrName",appoint.getInstrName());
        List <Appoint>list=findByCondition(condition);

        return list;


    }
}
