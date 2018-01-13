package com.arya.demo.provider;

import com.yoku.arya.annotation.resolver.RpcProviderProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class DemoProviderApplication {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(1);
		SpringApplication.run(DemoProviderApplication.class, args);
		countDownLatch.await();
	}

	@Bean
	public RpcProviderProcessor rpcProviderProcessor() {
		return new RpcProviderProcessor();
	}
}
