package com.atguigu.utils;

/**
 * @Author: ypdstart
 * @Description:
 * @Date: 2020/8/14 15:03
 * @Version: 1.0
 */
public class RanOpt<T>{
    T value ;
    int weight;

    public RanOpt ( T value, int weight ){
        this.value=value ;
        this.weight=weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }
}

