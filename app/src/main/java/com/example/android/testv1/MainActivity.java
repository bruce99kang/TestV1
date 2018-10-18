package com.example.android.testv1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnHotText = (Button) findViewById(R.id.button_MainPage1);
        btnHotText.setOnClickListener(this);
        Button btnBoardList = (Button) findViewById(R.id.button_LivingRoom1);
        btnBoardList.setOnClickListener(this);
        //如何新增新物件時，自動產生onClickListener?


    }

    @Override
    //根據按不同的按鍵，來load那個頁面的資料
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_MainPage1:
                //loadData(); 重整已輸入的資料
                //連到熱門看板頁的程式
                Intent boardListIntent = new Intent(this, BoardListActivity.class);
                boardListIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(boardListIntent);
                overridePendingTransition(0, 0);
                break;
            case R.id.button_LivingRoom1:
                //loadData() ;之後要加上連到熱門看板頁的程式
                break;


        }
    }
}
