package com.messaging.rabbitmq;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAMQPApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringAMQPApplication.class, args);
  }

  // if messages are custom Java objects rather than String, int etc
  @Bean
  public Jackson2JsonMessageConverter jsonMessageConverter() {
    return new Jackson2JsonMessageConverter();
  }

//  @Bean
//  public Queue myQueue() {
//    return new Queue("email");
//  }
}
