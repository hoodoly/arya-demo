package com.arya.demo.comsumer;

import com.yoku.arya.annotation.resolver.RpcConsumerProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author HODO
 */
@SpringBootApplication
public class DemoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConsumerApplication.class, args);
	}

	@Bean
	public RpcConsumerProcessor rpcConsumerProcessor() {
		return new RpcConsumerProcessor();
	}
}
