package com.imooc.demo.controller;

import com.imooc.demo.entity.Area;
import com.imooc.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    private Map<String,Object>  listArea(){
        Map<String,Object> modelMap = new ConcurrentHashMap<String,Object>();
        List<Area> list = areaService.getAreaList();
        modelMap.put("areaList",list);
        return modelMap;
    }

    @RequestMapping(value = "/getareabyid",method = RequestMethod.GET)
    private Map<String,Object> getAreaById(Integer areaId){
        Map<String ,Object> modelMap = new ConcurrentHashMap<String,Object>();
        Area area = areaService.getAreaById(areaId);
        modelMap.put("area",area);
        return modelMap;
    }

    @RequestMapping(value = "/addarea",method = RequestMethod.POST)
    private Map<String,Object> addArea(@RequestBody Area area){
        Map<String ,Object> modelMap = new ConcurrentHashMap<String,Object>();
        modelMap.put("success",areaService.addArea(area));
        return  modelMap;
    }

    @RequestMapping(value = "/modifyarea",method = RequestMethod.POST)
    private Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> modelMap = new ConcurrentHashMap<String,Object>();
        //修改区域信息
        modelMap.put("success",areaService.modifyArea(area));
        return  modelMap;
    }

    @RequestMapping(value = "/removearea",method = RequestMethod.GET)
    private Map<String,Object> removeArea(@RequestParam Integer areaId){
//        System.out.println("areaId"+areaId);
        Map<String,Object> modelMap = new ConcurrentHashMap<String,Object>();
        //删除区域信息
        modelMap.put("success",areaService.deleteArea(areaId));
        return modelMap;
    }
}
