package com.wwc.game.chess.ky.service;

import com.wwc.game.chess.ky.po.GamePlatformConfiginfo;

import java.util.List;

/**
 * Description: wwc-game
 * <p>
 * Created by saiya on 2019/3/28 0028 下午 1:55
 */
public interface GamePlatformConfiginfoService {
    List<GamePlatformConfiginfo> getAll();

    GamePlatformConfiginfo add(GamePlatformConfiginfo info);
}
