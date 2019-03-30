package com.wwc.game.chess.ky.api;

import com.wwc.game.chess.ky.po.PlatformChangeRecord;
import com.wwc.game.chess.ky.query.QueryPlatformChangeRecord;
import com.wwc.game.chess.ky.service.PlatformChangeRecordService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: 额度转换
 * <p>
 * Created by saiya on 2019/3/28 0028 下午 3:00
 */

@RestController
@RequestMapping("/platformChangeRecord")
public class PlatformChangeRecordController {
    @Autowired
    private PlatformChangeRecordService platformChangeRecordService;


    @ApiOperation(value = "新增额度转换")
    @PostMapping("add")
    public PlatformChangeRecord add(@RequestBody PlatformChangeRecord info) {
        return platformChangeRecordService.add(info);
    }

    @ApiOperation(value = "查询额度转换记录")
    @PostMapping("getByPage")
    public List<PlatformChangeRecord> getByPage(@RequestBody QueryPlatformChangeRecord query) {
        return platformChangeRecordService.getByPage(query);
    }


}
