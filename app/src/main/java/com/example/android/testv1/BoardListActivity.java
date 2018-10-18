package com.example.android.testv1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoardListActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_list);

        Button btnHotText = (Button) findViewById(R.id.button_MainPage1);
        btnHotText.setOnClickListener(this);
        Button btnBoardList = (Button) findViewById(R.id.button_LivingRoom1);
        btnBoardList.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_MainPage1: //案取主要頁面時
                Intent mainIntent = new Intent(this, MainActivity.class);
                mainIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(mainIntent);
                overridePendingTransition(0,0);
                return;
            case R.id.button_LivingRoom1:
                //之後要加上重整資料的程式
                return;
        }
    }
}
