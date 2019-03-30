package com.wwc.game.chess.ky.common;

/**
 * Description: 全局唯一ID生成
 * <p>
 * Created by saiya on 2019/3/25 0025 下午 4:32
 */
public class IdService {
    public static long getNextId() {
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(1, 1);
        Long nextId = idWorker.nextId();
        return nextId;
    }
}
