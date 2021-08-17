package com.example.provider.serviceImpl;

import com.example.provider.service.ProviderService;
import org.springframework.stereotype.Service;

/**
 * @author : chenghao
 * create at:  2021/8/6  4:46 下午
 * @description:
 */

@Service
public class ProviderServiceImpl implements ProviderService {

    public String sayHello2Consumer(String s) {
        System.out.println("provider s : "+ s);

        return null;
    }
}

