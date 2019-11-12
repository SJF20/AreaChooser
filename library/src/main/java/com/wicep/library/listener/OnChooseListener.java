package com.wicep.library.listener;

import com.wicep.library.entity.Area;

/**
 * Function: 选择区域监听器
 * Author: ShiJingFeng
 * Date: 2019/11/12 16:59
 * Description:
 */
public interface OnChooseListener {

    /**
     * 选择的区域
     * @param area 区域
     */
    void onChoose(Area area);

}
