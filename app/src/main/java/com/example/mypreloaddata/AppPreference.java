package com.example.mypreloaddata;

import android.content.Context;
import android.content.SharedPreferences;

public class AppPreference {
    private static final String PREFS_NAME = "MahasiswaPref";
    private static final String APP_FIRST_RUN = "app_first_run";
    private SharedPreferences prefs;

    public AppPreference(Context context) {
        prefs = context.getSharedPreferences(PREFS_NAME, context.MODE_PRIVATE);
    }

    public void setFirstRun(boolean input){
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(APP_FIRST_RUN, input);
        editor.apply();
    }

    public boolean getFirstRun(){
        return prefs.getBoolean(PREFS_NAME, true);
    }
}
