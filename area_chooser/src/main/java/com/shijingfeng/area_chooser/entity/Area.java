package com.shijingfeng.area_chooser.entity;

import com.shijingfeng.area_chooser.util.CastUtil;

import static com.shijingfeng.area_chooser.constant.Constant.COUNTY;
import static com.shijingfeng.area_chooser.constant.Constant.CITY;
import static com.shijingfeng.area_chooser.constant.Constant.PROVINCE;

/**
 * Function: 地区抽象实体类
 * Author: ShiJingFeng
 * Date: 2019/11/12 11:14
 * Description:
 */
public abstract class Area {

    /**
     * 获取区域级别
     * @return 区域级别
     */
    public int getAreaLevel() {
        final int areaLevel;

        if (this instanceof Province) {
            areaLevel = PROVINCE;
        } else if (this instanceof City) {
            areaLevel = CITY;
        } else if (this instanceof County) {
            areaLevel = COUNTY;
        } else {
            areaLevel = -1;
        }

        return areaLevel;
    }

    /**
     *  获取区域
     * @param <T> Area
     * @return 区域
     */
    public <T extends Area> T getArea() {
        return CastUtil.cast(this);
    }

}
