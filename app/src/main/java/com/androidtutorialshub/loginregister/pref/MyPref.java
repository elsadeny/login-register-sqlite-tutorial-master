package com.androidtutorialshub.loginregister.pref;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;
import java.util.Map;

public class MyPref {
    private  Context context;
    SharedPreferences.Editor editor;
    SharedPreferences sharedPreferences;


    public MyPref(Context context)
    {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("ContextPref",Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }



    public void saveUser(String email,String password)
    {
        editor.putString("email",email);
        editor.putString("password",password);
        editor.commit();
    }

    public boolean isLoggedIn()
    {
        if(sharedPreferences.getString("email",null)!=null)
        {
            return true;
        }else
            return false;
    }


    public Map<String,String> getUser()
    {
        Map<String,String > map = new HashMap<>();
        map.put("email",sharedPreferences.getString("email",null));
        map.put("passoword",sharedPreferences.getString("password",null));
        return map;
    }
    public String getMyPin()
    {
        return sharedPreferences.getString("pin",null);
    }
    public void setMyPin(String pin)
    {
        editor.putString("pin",pin);
        editor.commit();
    }
}
