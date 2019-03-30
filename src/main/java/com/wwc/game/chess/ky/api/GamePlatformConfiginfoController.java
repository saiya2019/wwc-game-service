package com.wwc.game.chess.ky.api;

import com.wwc.common.entity.ResponseObject;
import com.wwc.common.request.BaseController;
import com.wwc.game.chess.ky.po.GamePlatformConfiginfo;
import com.wwc.game.chess.ky.service.GamePlatformConfiginfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description: 平台表
 * <p>
 * Created by saiya on 2019/3/28 0028 下午 1:52
 */
@RestController
@RequestMapping("/gamePlatform")
public class GamePlatformConfiginfoController extends BaseController {
    @Autowired
    private GamePlatformConfiginfoService gamePlatformService;


    @ApiOperation(value = "新增平台", response = GamePlatformConfiginfo.class)
    @PostMapping("add")
    public ResponseObject add(@RequestBody GamePlatformConfiginfo info) {
        GamePlatformConfiginfo result = gamePlatformService.add(info);
        return ResponseObject.ofData(result);
    }

    @ApiOperation(value = "查询所有可用平台", response = GamePlatformConfiginfo.class)
    @GetMapping("getAll")
    public ResponseObject getAll() {
        List<GamePlatformConfiginfo> list = gamePlatformService.getAll();
        return ResponseObject.ofData(list);
    }


}
