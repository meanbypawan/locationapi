package com.testapp;

public class Location {
  private int locationId;
  private String countryName;
  private String cityName;
  int month;
  int day;
  int year;

    public Location(int locationId, String countryName, String cityName, int month, int day, int year) {
        this.locationId = locationId;
        this.countryName = countryName;
        this.cityName = cityName;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Location() {
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
  
}
