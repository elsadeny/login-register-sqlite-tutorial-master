package com.androidtutorialshub.loginregister.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.androidtutorialshub.loginregister.R;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener
{

    AppCompatButton btnLogout,btnUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogout = (AppCompatButton)findViewById(R.id.appCompatButtonLogout);
        btnUsers = (AppCompatButton)findViewById(R.id.appCompatButtonUserList);

        btnLogout.setOnClickListener(this);
        btnUsers.setOnClickListener(this);
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
