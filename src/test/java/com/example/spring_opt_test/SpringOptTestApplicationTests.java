package com.example.spring_opt_test;

import com.example.spring_opt_test.config.KafkaProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringOptTestApplicationTests {

	private KafkaProducer kafkaProducer;
//
	@Autowired
	public SpringOptTestApplicationTests(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}

	@Test
	void contextLoads() {
	}

	@Test
	void kafkatest() {
		kafkaProducer.create();
	}

}
