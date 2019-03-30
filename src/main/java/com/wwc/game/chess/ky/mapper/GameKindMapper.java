package com.wwc.game.chess.ky.mapper;

import com.wwc.game.chess.ky.po.GameKind;
import com.wwc.game.chess.ky.po.GameKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameKindMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(GameKindExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(GameKindExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(GameKind record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(GameKind record);

    /**
     *
     * @mbggenerated
     */
    List<GameKind> selectByExample(GameKindExample example);

    /**
     *
     * @mbggenerated
     */
    GameKind selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GameKind record, @Param("example") GameKindExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GameKind record, @Param("example") GameKindExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GameKind record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GameKind record);
}