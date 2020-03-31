package com.hank;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author hank
 * @create 2020-03-30 21:17
 */
public class Test01 {

    List<People> list = Arrays.asList(
            new People("zhangsan", 25),
            new People("lisi", 2),
            new People("wangwu", 36),
            new People("zhaoliu", 89),
            new People("tianqi", 45)
    );

    @Test
    public void test01() {
        Collections.sort(list, (x, y) -> {
            if (x.getAge() == y.getAge()) {
                return x.getName().compareTo(y.getName());
            } else {
                return x.getAge() - y.getAge();
            }
        });
        for (People p : list) {
            System.out.println(p);
        }
    }

    @Test
    public void test02() {
        System.out.println(strHander("    \t\t\t\t 哈哈哈哈哈哈  ", (x) -> x.trim()));
        System.out.println(strHander("abcdef", (x) -> x.toUpperCase()));
    }

    public String strHander(String str, MyInterface my) {
        return my.getValues(str);
    }

    @Test
    public void Test03() {
        System.out.println(getRes(20L, 30L, (x, y) -> x + y));
    }

    public Long getRes(Long l1, Long l2, MyInterface2<Long, Long> my) {
        return (Long) my.fun(l1, l2);
    }

    //消费型
    @Test
    public void test04() {
        run(20000, x -> System.out.println("消费了" + x + "元"));
    }

    public void run(double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    //供给型


}
