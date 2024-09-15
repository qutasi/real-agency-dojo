package com.codecool;

public class User {
  
  private String name;
  private String contact;
  
  public User(String name, String contact) {
    this.name = name;
    this.contact = contact;
  }
  
  public String getName() {
    return name;
  }
  
  public String getContact() {
    return contact;
  }
  
  //TODO: implement method that send direct message to another user.
  public void sendMessage(User recipient, String message) {
    System.out.println(this.name + " sent message to " + recipient.getName() + " " + message);
  }
}
