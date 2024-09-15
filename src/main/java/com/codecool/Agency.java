package com.codecool;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Agency {
  
  private Set<User> users;
  private Set<Ad> ads;
  
  public Agency(Set<User> users, Set<Ad> ads) {
    this.users = new HashSet<>(users);
    this.ads = new HashSet<>(ads);
  }
  
  public void addUser(User user) {
    users.add(user);
  }
  
  //TODO: implement filter methods for: district, price, furnished.
  
  public Set<Ad> filterByDistrict(District district) {
    Set<Ad> filteredAds = new HashSet<>();
    for (Ad ad : ads) {
      if (ad.getDistrict().equals(district)) {
        filteredAds.add(ad);
      }
    }
    return filteredAds;
  }
  
  public Set<Ad> filterByPrice(double minPrice, double maxPrice) {
    Set<Ad> filteredAds = new HashSet<>();
    for (Ad ad : ads) {
      if (ad.getPrice() >= minPrice && ad.getPrice() <= maxPrice) {
        filteredAds.add(ad);
      }
    }
    return filteredAds;
  }
  
  public Set<Ad> filterByStatus(boolean isFurnished) {
    Set<Ad> filteredAds = new HashSet<>();
    for (Ad ad : ads) {
      if (ad.isFurnished() == isFurnished) {
        filteredAds.add(ad);
      }
    }
    return filteredAds;
  }
  
  public Set<Ad> filterByDistrictAndPriceAndIsFurnitured(District district, double maxPrice, boolean isFurnitured) {
    Set<Ad> filteredAds = new HashSet<>();
    for (Ad ad : ads) {
      if (ad.isInDistrict(district) && ad.isWithinPrice(maxPrice) && ad.isFurnished()) {
        filteredAds.add(ad);
      }
    }
    return filteredAds;
  }
  
  public Set<Ad> filterByEverything(District district, boolean isFurnitured, double maxPrice) {
    return ads.stream()
        .filter(ad -> ad.isInDistrict(district) && ad.isWithinPrice(maxPrice) && ad.isFurnished())
        .collect(Collectors.toSet());
  }
  
}
