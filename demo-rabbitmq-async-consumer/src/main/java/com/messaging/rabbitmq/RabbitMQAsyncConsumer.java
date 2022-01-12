package com.messaging.rabbitmq;

import com.messaging.rabbitmq.dto.Email;
import com.messaging.rabbitmq.dto.Notification;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQAsyncConsumer {

  // auto declare queue and bind to default exchange(message goes to a dedicated queue)
  @RabbitListener(queuesToDeclare = @Queue(name = "email", durable = "true"), concurrency = "1-2")
  public void processEmail(Email message) {
    System.out.println(
        "**** RECEIVED [EMAIL] " + message);
  }

  @RabbitListener(queuesToDeclare = @Queue(name = "notification", durable = "true"))
  public void processNotification(Notification message) {
    System.out.println(
        "**** RECEIVED [NOTIFICATION] " + message);
  }

  // auto declare queue and bind to fanout exchange(message goes to all queues bound to this
  // exchange)
//  @RabbitListener(bindings = @QueueBinding(
//      value = @Queue(value = "fanoutQ1", durable = "true"),
//      exchange = @Exchange(value = "amq.fanout", ignoreDeclarationExceptions = "true", type =
//          FANOUT),
//      key = "fanoutKey")
//  )
//  public void processFanoutQueue1(String message) {
//    System.out.println(
//        "**** RECEIVED [ FANOUT Q1] [Message: " + message + "]");
//  }
//
//  @RabbitListener(bindings = @QueueBinding(
//      value = @Queue(value = "fanoutQ2", durable = "true"),
//      exchange = @Exchange(value = "amq.fanout", ignoreDeclarationExceptions = "true", type = FANOUT),
//      key = "fanoutKey")
//  )
//  public void processFanoutQueue2(String message) {
//    System.out.println(
//        "**** RECEIVED [ FANOUT Q2] [Message: " + message + "]");
//  }
}
