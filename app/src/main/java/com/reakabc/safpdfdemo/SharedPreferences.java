package com.reakabc.safpdfdemo;

import android.content.Context;

public class SharedPreferences {
    android.content.SharedPreferences sharedPreferences;
    Context context;

    public SharedPreferences(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.shared_preferences), context.MODE_PRIVATE);
    }

    public void writeLastUri(String u_id) {
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getResources().getString(R.string.last_uri), u_id);
        editor.apply();
    }

    public String readLastUri() {
        return sharedPreferences.getString(context.getResources().getString(R.string.last_uri), "0");
    }

}
