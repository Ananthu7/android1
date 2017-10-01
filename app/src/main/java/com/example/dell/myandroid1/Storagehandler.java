package com.example.dell.myandroid1;

import android.content.Context;
import android.icu.text.DateFormat;

import static android.R.attr.value;

/**
 * Created by DELL on 10/1/2017.
 */

public class Storagehandler {


    private static final String USER_NAME = "user_name";
    private static final String USER_PASSWORD = "user_password";
    private static final String USER_CHECKED_STATUS = "is checked" ;

    public static void insertUsername(Context context, String value) {
        AppStorage.insertStringData(context,USER_NAME,value);
    }

    public static void insertPassword(Context context, String value) {
        AppStorage.insertStringData(context,USER_PASSWORD,value);
    }

    public static void setChecked(Context context, boolean value) {
        AppStorage.insertBooleanData(context,USER_CHECKED_STATUS,value);
    }

    public static boolean isChecked(Context context) {
        return AppStorage.getBooleanData(context,USER_CHECKED_STATUS);
    }
}
