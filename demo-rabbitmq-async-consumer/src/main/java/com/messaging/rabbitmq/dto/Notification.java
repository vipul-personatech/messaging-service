package com.messaging.rabbitmq.dto;

public class Notification {

  private Integer id;

  private boolean bool;

  private String string;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public boolean isBool() {
    return bool;
  }

  public void setBool(boolean bool) {
    this.bool = bool;
  }

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  @Override
  public String toString() {
    return "Notification{" +
        "id=" + id +
        ", bool=" + bool +
        ", string='" + string + '\'' +
        '}';
  }
}
