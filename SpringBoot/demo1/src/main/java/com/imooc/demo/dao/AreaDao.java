package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> queryArea();

    /**
     * 根据ID列出具体区域
     * @param areaId
     * @return area
     */
    Area queryAreaById(int areaId);

    /**
     *插入区域信息
     * @param area
     * @return 成功失败
     */
    int insertArea(Area area);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);

}
