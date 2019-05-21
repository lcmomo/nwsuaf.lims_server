package cn.edu.nwsuaf.lims.service.impl;

import cn.edu.nwsuaf.lims.dao.SupplierMapper;
import cn.edu.nwsuaf.lims.model.Supplier;
import cn.edu.nwsuaf.lims.service.SupplierService;
import cn.edu.nwsuaf.lims.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by liuchao Li on 2019/05/21.
 */
@Service
@Transactional
public class SupplierServiceImpl extends AbstractService<Supplier> implements SupplierService {
    @Resource
    private SupplierMapper supplierMapper;

}
