package com.wwc.game.chess.ky.business;

import java.io.Serializable;

/**
 * Description: wwc-game
 * <p>
 * Created by saiya on 2019/3/28 0028 下午 3:04
 */
public class BaseRequestPage implements Serializable {
    private Integer pageIndex;

    private Integer pageSize;


    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
