package com.test.mutlidatasource.controller;//package com.test.mutlidatasource.controller;
//
//import com.test.mutlidatasource.MyRequest;
//import com.test.mutlidatasource.aop.DynamicDataSource;
//import com.test.mutlidatasource.core.EasyMultiEntityQuery;
//import com.test.mutlidatasource.entities.Topic;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * create time 2024/3/13 15:58
// * 文件说明
// *
// * @author xuejiaming
// */
//@RestController
//@RequestMapping("/my")
//@RequiredArgsConstructor(onConstructor_ = @Autowired)
//public class MyController {
//    private final EasyMultiEntityQuery easyMultiEntityQuery;
//
//    @RequestMapping("/test")
//    @DynamicDataSource("ds2")
//    public Object test(){
//        return easyMultiEntityQuery.queryable(Topic.class).toList();
//    }
//    @RequestMapping("/test1")
//    @DynamicDataSource
//    public Object test1(){
//        return easyMultiEntityQuery.queryable(Topic.class).toList();
//    }
//    @RequestMapping("/test2")
//    @DynamicDataSource("#request.ds")
//    public Object test2(@RequestBody MyRequest request){
//        return easyMultiEntityQuery.queryable(Topic.class).toList();
//    }
//    @RequestMapping("/test3")
//    public Object test3(){
//        List<Topic> ds2 = easyMultiEntityQuery.executeScope("ds2", eq -> {
//            return eq.queryable(Topic.class).toList();
//        });
//        return ds2;
//    }
//    @RequestMapping("/test4")
//    public Object test4(){
//        try {
//            easyMultiEntityQuery.setCurrent("ds2");
//            return easyMultiEntityQuery.queryable(Topic.class).toList();
//        }finally {
//            easyMultiEntityQuery.clear();
//        }
//    }
//}
