package com.example.austin.layouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MenuActivity extends Activity {
    Button butPlay;
    TextView tvScore;

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.rbL1:
                if (checked) {
                    break;
                }
                break;
            case R.id.rbL2:
                if (checked) {
                    break;
                }
                break;
            case R.id.rbL3:
                if (checked) {
                    break;
                }
                break;
            case R.id.rbL4:
                if (checked) {
                    break;
                }
                break;
            case R.id.rbL5:
                if (checked) {
                    break;
                }
                break;
            case R.id.rbL6:
                if (checked) {
                    break;
                }
                break;
            case R.id.rbL7:
                if (checked) {
                    break;
                }
                break;
            case R.id.rbL8:
                if (checked) {
                    break;
                }
                break;
            case R.id.rbL9:
                if (checked) {
                    break;
                }
                break;
            case R.id.rbL10:
                if (checked) {
                    break;
                }
                break;
            case R.id.rbL11:
                if (checked) {
                    break;
                }
                break;
            case R.id.rbL12:
                if (checked) {
                    break;
                }
                break;   
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        butPlay = (Button) findViewById(R.id.butPlay);
        butPlay.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent nextScreen=new Intent(getApplicationContext(), MyActivity.class);
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
            Intent nextScreen=new Intent(getApplicationContext(), SettingsActivity.class);
            startActivity(nextScreen);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
