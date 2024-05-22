package com.example.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class WikimediaTopicConfig {

	// Apache Broker에 새로운 메시지 브로커를 쓰겠다
	@Bean
	public NewTopic wikimediaStreamTopic() {
		return TopicBuilder
				.name("wikimedia-stream")
				.build();
	}
}
