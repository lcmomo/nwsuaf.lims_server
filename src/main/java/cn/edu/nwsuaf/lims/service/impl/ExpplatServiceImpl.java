package cn.edu.nwsuaf.lims.service.impl;

import cn.edu.nwsuaf.lims.dao.ExpplatMapper;
import cn.edu.nwsuaf.lims.model.Expplat;
import cn.edu.nwsuaf.lims.service.ExpplatService;
import cn.edu.nwsuaf.lims.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by liuchao Li on 2019/05/12.
 */
@Service
@Transactional
public class ExpplatServiceImpl extends AbstractService<Expplat> implements ExpplatService {
    @Resource
    private ExpplatMapper expplatMapper;

}
