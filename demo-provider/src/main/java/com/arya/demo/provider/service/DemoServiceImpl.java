package com.arya.demo.provider.service;

import com.yoku.arya.annotation.RpcProvider;
import org.springframework.stereotype.Service;

/**
 * @author HODO
 * @date 2018/1/4
 */
@Service
@RpcProvider
public class DemoServiceImpl implements DemoService {

    @Override
    public int count(int number) {
        return ++number;
    }
}
