package com.androidtutorialshub.loginregister.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.androidtutorialshub.loginregister.R;
import com.androidtutorialshub.loginregister.pref.MyPref;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener
{

    AppCompatButton btnLogout,btnUsers;
    AppCompatTextView welcome;
    MyPref myPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogout = (AppCompatButton)findViewById(R.id.appCompatButtonLogout);
        btnUsers = (AppCompatButton)findViewById(R.id.appCompatButtonUserList);
        welcome=(AppCompatTextView)findViewById(R.id.welcome);

        btnLogout.setOnClickListener(this);
        btnUsers.setOnClickListener(this);
        myPref = new MyPref(this);
        Map<String,String> map = new HashMap<>();
        map = myPref.getUser();
        welcome.setText("welcome /n"+map.get("email"));
    }

    @Override
    public void onClick(View view)
    {
        if(view == btnLogout)
        {
            startActivity(new Intent(this,LoginActivity.class));
            finish();
        }

        if(view == btnUsers)
        {
            startActivity(new Intent(this,UsersListActivity.class));
            finish();
        }
    }

}
