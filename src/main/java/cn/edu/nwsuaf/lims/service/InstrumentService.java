package cn.edu.nwsuaf.lims.service;
import cn.edu.nwsuaf.lims.model.Instrument;
import cn.edu.nwsuaf.lims.core.Service;

import java.util.List;


/**
 * Created by liuchao Li on 2019/05/20.
 */
public interface InstrumentService extends Service<Instrument> {

    public List<Instrument> findByPlatname(String platname);
}
