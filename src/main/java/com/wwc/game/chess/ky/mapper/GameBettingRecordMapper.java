package com.wwc.game.chess.ky.mapper;

import com.wwc.game.chess.ky.po.GameBettingRecord;
import com.wwc.game.chess.ky.po.GameBettingRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingRecordMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(GameBettingRecordExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(GameBettingRecordExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(GameBettingRecord record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(GameBettingRecord record);

    /**
     *
     * @mbggenerated
     */
    List<GameBettingRecord> selectByExample(GameBettingRecordExample example);

    /**
     *
     * @mbggenerated
     */
    GameBettingRecord selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GameBettingRecord record, @Param("example") GameBettingRecordExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GameBettingRecord record, @Param("example") GameBettingRecordExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GameBettingRecord record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GameBettingRecord record);
}