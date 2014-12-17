package com.example.austin.layouts;

import android.app.Activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import junit.framework.Test;


public class SettingsActivity extends Activity {
    Button butPlay;
    MediaPlayer mpMusic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Switch toggle = (Switch) findViewById(R.id.switchSound);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //String sToast = "Now Playing: Re-Birthday";
                //Toast toMusic = Toast.makeText(SettingsActivity.this, sToast,Toast.LENGTH_SHORT);
                //toMusic.show();
                if (isChecked) {
                    mpMusic = MediaPlayer.create(SettingsActivity.this, R.raw.musicfile);
                    mpMusic.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.reset();
                            mp.release();

                        }

                    });
                    mpMusic.start();
                    String sToast = "Now Playing: Re-Birthday";
                    Toast toMusic = Toast.makeText(SettingsActivity.this, sToast,Toast.LENGTH_SHORT);
                    toMusic.show();
                } else {
                    mpMusic.pause();
                    String sToast = "Stopped";
                    Toast toMusic = Toast.makeText(SettingsActivity.this, sToast,Toast.LENGTH_SHORT);
                    toMusic.show();
                }
            }
        });
        butPlay = (Button) findViewById(R.id.butSc1);
        butPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), menu1Scratch.class);
                startActivity(nextScreen);
            }
        });
        butPlay = (Button) findViewById(R.id.butSc2);
        butPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), imgScratch.class);
                startActivity(nextScreen);
            }
        });
        butPlay = (Button) findViewById(R.id.butSc3);
        butPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), rbScratch.class);
                startActivity(nextScreen);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


