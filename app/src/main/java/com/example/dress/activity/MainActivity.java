package com.example.dress.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.dress.util.cache;

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(cache.getCacheToken()==null){
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(this,ViewActivity.class);
            startActivity(intent);
        }
        //llllll
        //text
    }
}
