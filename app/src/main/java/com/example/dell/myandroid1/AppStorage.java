package com.example.dell.myandroid1;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by DELL on 10/1/2017.
 */

    public class AppStorage {


    private static final String PREFERENCE_NAME = "prefrenceapp";

    public static void insertStringData(Context context, String key, String value) {
getSharedPreference(context).edit().putString(key,value).apply();
    }
    private static SharedPreferences getSharedPreference(Context context) {
        return context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    public static void insertBooleanData(Context context, String key, boolean value) {
        getSharedPreference(context).edit().putBoolean(key, value).apply();
    }

    public static boolean getBooleanData(Context context, String key) {
        return getSharedPreference(context).getBoolean(key,false);

    }
}
