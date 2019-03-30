package com.wwc.game.chess.ky.mapper;

import com.wwc.game.chess.ky.po.GameKindServerHouse;
import com.wwc.game.chess.ky.po.GameKindServerHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameKindServerHouseMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(GameKindServerHouseExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(GameKindServerHouseExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(GameKindServerHouse record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(GameKindServerHouse record);

    /**
     *
     * @mbggenerated
     */
    List<GameKindServerHouse> selectByExample(GameKindServerHouseExample example);

    /**
     *
     * @mbggenerated
     */
    GameKindServerHouse selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GameKindServerHouse record, @Param("example") GameKindServerHouseExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GameKindServerHouse record, @Param("example") GameKindServerHouseExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GameKindServerHouse record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GameKindServerHouse record);
}