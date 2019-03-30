package com.wwc.game.chess.ky.service;

import com.wwc.game.chess.ky.po.PlatformChangeRecord;
import com.wwc.game.chess.ky.query.QueryPlatformChangeRecord;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: wwc-game
 * <p>
 * Created by saiya on 2019/3/28 0028 下午 1:55
 */
@Service(value = "platformChangeRecordService")
public interface PlatformChangeRecordService {

    PlatformChangeRecord add(PlatformChangeRecord info);


    /**
     *
     * @param code 调用第三方接口返回结果的code值
     * @param info 平台转换额度记录信息
     * @return
     */
    Boolean add(Integer code,PlatformChangeRecord info);

    Boolean delete(Integer id);

    PlatformChangeRecord getById(Integer id);

    List<PlatformChangeRecord> getByPage(QueryPlatformChangeRecord query);


}
