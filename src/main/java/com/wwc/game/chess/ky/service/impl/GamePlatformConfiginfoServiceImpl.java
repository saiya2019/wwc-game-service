package com.wwc.game.chess.ky.service.impl;

import com.wwc.game.chess.ky.common.IdService;
import com.wwc.game.chess.ky.mapper.GamePlatformConfiginfoMapper;
import com.wwc.game.chess.ky.po.GamePlatformConfiginfo;
import com.wwc.game.chess.ky.po.GamePlatformConfiginfoExample;
import com.wwc.game.chess.ky.service.GamePlatformConfiginfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: wwc-game
 * <p>
 * Created by saiya on 2019/3/28 0028 下午 1:57
 */
@Service(value = "gamePlatformService")
public class GamePlatformConfiginfoServiceImpl implements GamePlatformConfiginfoService {

    @Autowired
    private GamePlatformConfiginfoMapper mapper;


    @Override
    public List<GamePlatformConfiginfo> getAll() {
        GamePlatformConfiginfoExample example = new GamePlatformConfiginfoExample();
        GamePlatformConfiginfoExample.Criteria criteria = example.createCriteria();
        //查询可用的平台
        criteria.andEnableEqualTo(true);
        return mapper.selectByExample(example);
    }

    @Override
    public GamePlatformConfiginfo add(GamePlatformConfiginfo info) {
        return null;
    }

}
