package cn.edu.nwsuaf.lims.service;
import cn.edu.nwsuaf.lims.model.Appoint;
import cn.edu.nwsuaf.lims.core.Service;

import java.text.ParseException;
import java.util.List;


/**
 * Created by liuchao Li on 2019/05/22.
 */
public interface AppointService extends Service<Appoint> {
    public List<Appoint> findByUsername(String username);
    public List<Appoint> findByInstrumentAndTime( Appoint appoint) throws ParseException;
}
