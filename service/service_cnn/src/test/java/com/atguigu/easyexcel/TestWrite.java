package com.atguigu.easyexcel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class TestWrite {
    public static void main(String[] args) {
        //构建数据list集合
        List<UserData> list = new ArrayList<>();
        for(int i =0;i<10;i++){
            UserData data = new UserData();
            data.setUid(i);
            data.setUsername("luvy"+i);
            list.add(data);
        }
        //设置Excel文件路径的名称
        String fileName = "E:\\JAVA_Practice\\excel\\01.xlsx";

        //调用方法实现写操作
        EasyExcel.write(fileName,UserData.class).sheet("用户信息")
                .doWrite(list);
    }
}
