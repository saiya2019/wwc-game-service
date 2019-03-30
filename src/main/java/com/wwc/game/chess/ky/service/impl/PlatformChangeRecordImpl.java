package com.wwc.game.chess.ky.service.impl;

import ch.qos.logback.classic.db.names.TableName;
import com.wwc.game.chess.ky.mapper.PlatformChangeRecordMapper;
import com.wwc.game.chess.ky.mapper.PlatformChangeRecordMapperExt;
import com.wwc.game.chess.ky.po.PlatformChangeRecord;
import com.wwc.game.chess.ky.query.QueryPlatformChangeRecord;
import com.wwc.game.chess.ky.query.Querytest;
import com.wwc.game.chess.ky.service.PlatformChangeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 额度转换记录service
 * <p>
 * Created by saiya on 2019/3/28 0028 下午 3:22
 */
@Service(value = "platformChangeRecordService")
public class PlatformChangeRecordImpl implements PlatformChangeRecordService {

    @Autowired
    PlatformChangeRecordMapper mapper;

    @Autowired
    PlatformChangeRecordMapperExt mapperExt;


    @Override
    public PlatformChangeRecord add(PlatformChangeRecord info) {
        try {
            if (info.getId() != 0) {
                mapper.updateByPrimaryKey(info);
            } else {
                int result = mapper.insert(info);
                info = result > 0 ? info : null;
            }
        } catch (Exception e) {
            return null;
        }
        return info;
    }

    @Override
    public Boolean add(Integer code, PlatformChangeRecord info) {
        if(code==0){
            return mapper.insert(info)>0;
        }
        else {
            return mapper.updateByPrimaryKey(info)>0;
        }

    }

    @Override
    public Boolean delete(Integer id) {
        return mapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public PlatformChangeRecord getById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }


    @Override
    public List<PlatformChangeRecord> getByPage(QueryPlatformChangeRecord query) {
        Querytest querytest=new Querytest();
        String appId=query.getAppId();

        if(appId.equals("xini_v2"))
        {
/*            String tableName="'"+"platform_change_record"+"_"+appId+"'";*/
            String tableName="platform_change_record"+"_"+appId;
            querytest.setTableName(tableName);
        }
        String account="'"+query.getAccount()+"'";
        querytest.setAccount(account);
        appId="'"+query.getAppId()+"'";
        querytest.setAppId(appId);
        return mapperExt.getByPage(querytest);
    }
}
