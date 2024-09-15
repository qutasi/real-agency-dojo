package com.codecool;

public class Ad {
  
  private int id;
  private String address;
  private District district;
  private Agent agent;
  private double price;
  private boolean furnished;
  
  public Ad(int id, String address, District district, Agent agent, double price, boolean furnished) {
    this.id = id;
    this.address = address;
    this.district = district;
    this.agent = agent;
    this.price = price;
    this.furnished = furnished;
  }
  
  public boolean isWithinPrice(double price) {
    return price >= this.price;
  }
  
  public District getDistrict() {
    return district;
  }
  
  public boolean isInDistrict(District district) {
    return this.district.equals(district);
  }
  
  public Agent getAgent() {
    return agent;
  }
  
  public double getPrice() {
    return price;
  }
  
  public boolean isFurnished() {
    return furnished;
  }
  
}
