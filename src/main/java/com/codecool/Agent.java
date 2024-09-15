package com.codecool;

import java.util.HashSet;
import java.util.Set;

public class Agent extends User {
  
  private Set<Ad> ads;
  
  public Agent(String name, String contact) {
    super(name, contact);
    this.ads = new HashSet<Ad>();
  }
  
  //TODO: implmenet: list of ads, can post ad method.
  public void addAd(Ad ad) {
    ads.add(ad);
  }
  
  public Set<Ad> listAds() {
    return ads;
  }
  
}
