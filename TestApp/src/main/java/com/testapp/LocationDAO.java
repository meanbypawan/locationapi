package com.testapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LocationDAO {
    public static ArrayList<Location> getLocationList(Location location){
        Connection con = null;
        ArrayList<Location> al = null;
        try{
          con =   GetConnection.getConnection();
          String sql = "select * from location where country_name =? and day =? and month=? and year=?";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, location.getCountryName());
            ps.setInt(2, location.getDay());
            ps.setInt(3, location.getMonth());
            ps.setInt(4, location.getYear());
            ResultSet rs = ps.executeQuery();
            al =  new ArrayList<Location>();
            while(rs.next()){
                int locationId = rs.getInt(1);
                String countryName = location.getCountryName();
                int day = location.getDay();
                int month = location.getMonth();
                int year = location.getYear();
                String cityName = rs.getString("city_name");
                al.add(new Location(locationId, countryName, cityName, month, day, year));
            }
        }
        catch(Exception e){
             e.printStackTrace();
        }
        finally{
            try{
                con.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return al;
    }
    
}
