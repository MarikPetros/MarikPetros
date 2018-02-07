package com.example.user.simpleweather;

import android.app.Activity;
import android.content.SharedPreferences;



class CityPreference {
    private SharedPreferences prefs;

    CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        return prefs.getString("city", "Sydney, AU");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).apply();
    }

}
