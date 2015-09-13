package com.example.akumo.traffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
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

        //Create ListView
        createListView();

    } // Main Method

    private void createListView() {

        //Setup Icon
        int intIcon[] = new int[20];
        intIcon[0] = R.drawable.traffic_01;
        intIcon[1] = R.drawable.traffic_02;
        intIcon[2] = R.drawable.traffic_03;
        intIcon[3] = R.drawable.traffic_04;
        intIcon[4] = R.drawable.traffic_05;
        intIcon[5] = R.drawable.traffic_06;
        intIcon[6] = R.drawable.traffic_07;
        intIcon[7] = R.drawable.traffic_08;
        intIcon[8] = R.drawable.traffic_09;
        intIcon[9] = R.drawable.traffic_10;
        intIcon[10] = R.drawable.traffic_11;
        intIcon[11] = R.drawable.traffic_12;
        intIcon[12] = R.drawable.traffic_13;
        intIcon[13] = R.drawable.traffic_14;
        intIcon[14] = R.drawable.traffic_15;
        intIcon[15] = R.drawable.traffic_16;
        intIcon[16] = R.drawable.traffic_17;
        intIcon[17] = R.drawable.traffic_18;
        intIcon[18] = R.drawable.traffic_19;
        intIcon[19] = R.drawable.traffic_20;

        //Setup Title
        String[] strTitle = new String[20];
        strTitle[0] = "ป้ายจราจรที่ 1";
        strTitle[1] = "ป้ายจราจรที่ 2";
        strTitle[2] = "ป้ายจราจรที่ 3";
        strTitle[3] = "ป้ายจราจรที่ 4";
        strTitle[4] = "ป้ายจราจรที่ 5";
        strTitle[5] = "ป้ายจราจรที่ 6";
        strTitle[6] = "ป้ายจราจรที่ 7";
        strTitle[7] = "ป้ายจราจรที่ 8";
        strTitle[8] = "ป้ายจราจรที่ 9";
        strTitle[9] = "ป้ายจราจรที่ 10";
        strTitle[10] = "ป้ายจราจรที่ 11";
        strTitle[11] = "ป้ายจราจรที่ 12";
        strTitle[12] = "ป้ายจราจรที่ 13";
        strTitle[13] = "ป้ายจราจรที่ 14";
        strTitle[14] = "ป้ายจราจรที่ 15";
        strTitle[15] = "ป้ายจราจรที่ 16";
        strTitle[16] = "ป้ายจราจรที่ 17";
        strTitle[17] = "ป้ายจราจรที่ 18";
        strTitle[18] = "ป้ายจราจรที่ 19";
        strTitle[19] = "ป้ายจราจรที่ 20";

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intIcon, strTitle);
        trafficListView.setAdapter(objMyAdapter);

        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent objIntent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(objIntent);
                
            }
        });

    } // createListView

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
