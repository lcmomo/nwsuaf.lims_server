package cn.edu.nwsuaf.lims.web;

import cn.edu.nwsuaf.lims.core.Result;
import cn.edu.nwsuaf.lims.core.ResultGenerator;
import cn.edu.nwsuaf.lims.model.Appoint;
import cn.edu.nwsuaf.lims.service.AppointService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.text.ParseException;
import java.util.List;

/**
* Created by liuchao Li on 2019/05/22.
*/
@RestController
@RequestMapping("/appoint")
public class AppointController {
    @Resource
    private AppointService appointService;

    @PostMapping("/add")
    public Result add(@RequestBody Appoint appoint) {
        appointService.save(appoint);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Appoint appoint) {
        appointService.deleteById(appoint.getId());
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Appoint appoint) {
        appointService.update(appoint);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam(defaultValue = "0") Integer id) {
        Appoint appoint = appointService.findById(id);
        return ResultGenerator.genSuccessResult(appoint);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Appoint> list = appointService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/find")
    public Result findByUserName(@RequestParam(defaultValue = "") String username) {


        List<Appoint> list = appointService.findByUsername(username);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/findbyTime")
    public Result findByInstrumentAndTime(@RequestBody Appoint appoint) {
System.out.println(appoint.getOrderTime());

        List<Appoint> list = null;

        try {
            list = appointService.findByInstrumentAndTime(appoint);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(list.size()==0) {
       return ResultGenerator.genSuccessResult();
        } else{
            return ResultGenerator.genFailResult("预约时间冲突，请重新选择");
        }


    }
}
