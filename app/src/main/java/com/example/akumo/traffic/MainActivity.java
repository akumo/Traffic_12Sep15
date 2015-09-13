package com.example.akumo.traffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial Widget
        initialWidget();

        //Button Controller
        buttonController();


    } // Main Method

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_shut);
                buttonMediaPlayer.start();

                //Intent to WebView เคลื่อนย้ายการทำงานจาก activity ไป activity หรือไปที่ app อื่นก็ได้ เช่นส่ง sms หรือโทรออกเลยก็ได้
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/ijXaCS8OTT4"));
                startActivity(objIntent);



            } // event จะทำงานเมื่อมีการกดปุ่มนี้
        });

    } // buttonController

    private void initialWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    } // initialWidget  bind ตัวแปรกับ object


} // Main Class
