package com.wwc.game.chess.ky.mapper;

import com.wwc.game.chess.ky.po.PlatformChangeRecord;
import com.wwc.game.chess.ky.query.QueryPlatformChangeRecord;
import com.wwc.game.chess.ky.query.Querytest;

import java.util.List;

/**
 * Description: wwc-game
 * <p>
 * Created by saiya on 2019/3/30 0030 上午 2:13
 */
public interface PlatformChangeRecordMapperExt {

    List<PlatformChangeRecord> getByPage(Querytest queryPlatformChangeRecord);
}
