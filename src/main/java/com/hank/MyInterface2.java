package com.hank;

/**
 * @author hank
 * @create 2020-03-30 21:40
 */
@FunctionalInterface
public interface MyInterface2<T, R> {
    public R fun(T t1, T t2);
}
