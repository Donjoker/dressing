package com.example.dress.activity;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.example.dress.R;
import com.example.dress.util.Envelope;

public class EnvelopeViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envelope_view);
        Envelope envelope = (Envelope)getIntent().getSerializableExtra("envelope_data");
        Toolbar toolbar = (Toolbar)findViewById(R.id.envelope_toolbar);
        CollapsingToolbarLayout collapsingToolbar=(CollapsingToolbarLayout)findViewById(R.id.collasping_toolbBar);
        ImageView envelope_Imgae = (ImageView)findViewById(R.id.envelope_image);
        TextView envelope_text = (TextView)findViewById(R.id.envelope_view_text);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbar.setTitle(envelope.getReceiver());
        Glide.with(this).load(envelope.getStampViewId()).into(envelope_Imgae);
        envelope_text.setText(envelope.getText());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
