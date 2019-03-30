package com.wwc.game.chess.ky.mapper;

import com.wwc.game.chess.ky.po.UserBettingRecord;
import com.wwc.game.chess.ky.po.UserBettingRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBettingRecordMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UserBettingRecordExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UserBettingRecordExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(UserBettingRecord record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UserBettingRecord record);

    /**
     *
     * @mbggenerated
     */
    List<UserBettingRecord> selectByExample(UserBettingRecordExample example);

    /**
     *
     * @mbggenerated
     */
    UserBettingRecord selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserBettingRecord record, @Param("example") UserBettingRecordExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserBettingRecord record, @Param("example") UserBettingRecordExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserBettingRecord record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserBettingRecord record);
}