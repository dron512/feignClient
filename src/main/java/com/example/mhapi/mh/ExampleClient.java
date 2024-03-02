package com.example.mhapi.mh;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test", url = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=861")
//@FeignClient(name = "test", url = "http://localhost:8082")
public interface ExampleClient {

    @GetMapping("")
    String getResource();
}

