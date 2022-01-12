package com.messaging.rabbitmq.dto;

public class Email {

  private String templateName;

  private String body;

  private String subject;

  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  @Override
  public String toString() {
    return "EmailNotification{" +
        "templateName='" + templateName + '\'' +
        ", body='" + body + '\'' +
        ", subject='" + subject + '\'' +
        '}';
  }
}
