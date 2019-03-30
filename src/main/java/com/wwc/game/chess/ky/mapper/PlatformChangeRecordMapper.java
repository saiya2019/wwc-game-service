package com.wwc.game.chess.ky.mapper;

import com.wwc.game.chess.ky.po.PlatformChangeRecord;
import com.wwc.game.chess.ky.po.PlatformChangeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatformChangeRecordMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(PlatformChangeRecordExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(PlatformChangeRecordExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(PlatformChangeRecord record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(PlatformChangeRecord record);

    /**
     *
     * @mbggenerated
     */
    List<PlatformChangeRecord> selectByExample(PlatformChangeRecordExample example);

    /**
     *
     * @mbggenerated
     */
    PlatformChangeRecord selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PlatformChangeRecord record, @Param("example") PlatformChangeRecordExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PlatformChangeRecord record, @Param("example") PlatformChangeRecordExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PlatformChangeRecord record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PlatformChangeRecord record);
}