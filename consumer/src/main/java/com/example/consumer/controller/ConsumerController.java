package com.example.consumer.controller;

import com.example.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : chenghao
 * create at:  2021/8/18  11:30 上午
 * @description:
 */

@RestController
public class ConsumerController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/hello")
    public void sayHello() {
        String str = providerService.sayHello2Consumer("Not hello ,just hi");
        System.out.println("consumer get str =" + str + "from provider");
    }
}

