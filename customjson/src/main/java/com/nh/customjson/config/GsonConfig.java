package com.nh.customjson.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.lang.reflect.Modifier;

/**
 * @Classname GsonConfig
 * @Description TODO
 * @Date 2019/8/14 8:16 PM
 * @Created by nihui
 */
@Configuration
public class GsonConfig {

    @Bean
    GsonHttpMessageConverter gsonHttpMessageConverter(){

        //提供了一个GsonHttpMessageConverter 的实例
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        GsonBuilder builder = new GsonBuilder();
        //设置Gson解析日期的格式
        builder.setDateFormat("yyyy-MM-dd");
        //设置Gson解析时修饰符为protected的字段将会被过滤掉
        builder.excludeFieldsWithModifiers(Modifier.PROTECTED,Modifier.PUBLIC);
        //创建并返回converter
        Gson gson = builder.create();

        converter.setGson(gson);
        return converter;
    }
}
