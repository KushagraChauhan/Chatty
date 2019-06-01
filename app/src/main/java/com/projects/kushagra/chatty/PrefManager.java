package com.projects.kushagra.chatty;

import android.content.Context;
import android.content.SharedPreferences;


public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;

    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "JS-welcome";
    private static final String IS_FIRST_LAUNCH = "IsFirstLaunch";

    public PrefManager(Context context){
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setFirstLaunch(boolean isFirst){
        editor.putBoolean(IS_FIRST_LAUNCH,isFirst);
        editor.commit();
    }

    public boolean isFirstLaunch(){
        return pref.getBoolean(IS_FIRST_LAUNCH,true);
    }
}
