package com.wwc.game.chess.ky.mapper;

import com.wwc.game.chess.ky.po.GamePlatformConfiginfo;
import com.wwc.game.chess.ky.po.GamePlatformConfiginfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GamePlatformConfiginfoMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(GamePlatformConfiginfoExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(GamePlatformConfiginfoExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(GamePlatformConfiginfo record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(GamePlatformConfiginfo record);

    /**
     *
     * @mbggenerated
     */
    List<GamePlatformConfiginfo> selectByExample(GamePlatformConfiginfoExample example);

    /**
     *
     * @mbggenerated
     */
    GamePlatformConfiginfo selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GamePlatformConfiginfo record, @Param("example") GamePlatformConfiginfoExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GamePlatformConfiginfo record, @Param("example") GamePlatformConfiginfoExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GamePlatformConfiginfo record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GamePlatformConfiginfo record);
}