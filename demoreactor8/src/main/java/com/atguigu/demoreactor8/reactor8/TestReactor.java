package com.atguigu.demoreactor8.reactor8;

import org.springframework.web.server.WebHandler;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/22-16:17
 */

public class TestReactor {
    public static void main(String[] args) {

        //just 方法之间申明数据流  并且订阅
        Flux.just(1,2,3,4).subscribe(System.out::println);
        Mono.just(1).subscribe(System.out::println);

//        //其他的方法
//        Integer[] array = {1,2,3,4};
//        Flux.fromArray(array);
//
//        List<Integer> list = Arrays.asList(array);
//        Flux.fromIterable(list);
//
//        Stream<Integer> stream = list.stream();
//        Flux.fromStream(stream);
//
//        //错误
//        Flux.error(new Exception());
    }
}
