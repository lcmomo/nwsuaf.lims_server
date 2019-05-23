package cn.edu.nwsuaf.lims.web;

import cn.edu.nwsuaf.lims.core.Result;
import cn.edu.nwsuaf.lims.core.ResultGenerator;
import cn.edu.nwsuaf.lims.model.Expplat;
import cn.edu.nwsuaf.lims.model.Instrument;
import cn.edu.nwsuaf.lims.service.InstrumentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by liuchao Li on 2019/05/20.
*/
@RestController
@RequestMapping("/instrument")
public class InstrumentController {
    @Resource
    private InstrumentService instrumentService;

    @PostMapping("/add")
    public Result add(@RequestBody Instrument instrument) {
        instrumentService.save(instrument);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Instrument instrument) {
        instrumentService.deleteById(instrument.getId());
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Instrument instrument) {
        instrumentService.update(instrument);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam(defaultValue = "0") Integer id) {
        Instrument instrument = instrumentService.findById(id);
        return ResultGenerator.genSuccessResult(instrument);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Instrument> list = instrumentService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/find")
    public Result findByPlatName(@RequestParam(defaultValue = "") String platname) {


        List<Instrument> list = instrumentService.findByPlatname(platname);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}


