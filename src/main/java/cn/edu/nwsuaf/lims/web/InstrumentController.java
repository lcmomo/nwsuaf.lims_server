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

    @PostMapping
    public Result add(@RequestBody Instrument instrument) {
        instrumentService.save(instrument);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        instrumentService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Instrument instrument) {
        instrumentService.update(instrument);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Instrument instrument = instrumentService.findById(id);
        return ResultGenerator.genSuccessResult(instrument);
    }

    @GetMapping
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


