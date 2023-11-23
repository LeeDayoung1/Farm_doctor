package com.example.farmdoctor;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class foodcropActivity extends AppCompatActivity {
    public static String keyItemCode, keyKindCode, keyRanks, keyImage;

    String [] fcItemCodeList = {"0","152","152","152","152","152","152","152","151","161","143","143","144","162","163","111","111","164","112","141","141","141","142","142"};

    String [] fcKindCodeList = {"0","1","2","3","4","5","6","0","1","0","1","1","1","1","1","5","1","1","1","3","2","0","1"};
    String [] fcRanksList = {"상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","중품","중품","상품","중품",
            "상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","중품","상품","중품","상품","중품","중품"};
    String [] fcImageList = {"potato","potato","potato","potato","potato","potato","potato","sweetpotato","oat","greenbean","greenbean","buckwheat","barley","sorghumbicolor",
            "rice","rice","jobstears","glutinousrice","beans","beans","beansprouts","redbeans","redbeans"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodcrop_page_1);

        // 'homebutton' 버튼 클릭 이벤트 처리
        ImageButton homeButton = findViewById(R.id.homebutton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(foodcropActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 'backbutton' 버튼 클릭 이벤트 처리
        ImageButton backButton = findViewById(R.id.backbutton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(foodcropActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        // 'button1' 버튼 클릭 이벤트 처리
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyItemCode = fcItemCodeList[1];
                keyKindCode = fcKindCodeList[1];
                keyRanks = fcRanksList[1];
                keyImage = fcImageList[1];
                Intent intent = new Intent(foodcropActivity.this, guideFoodcropActivity.class);
                startActivity(intent);
            }
        });
    }
}
