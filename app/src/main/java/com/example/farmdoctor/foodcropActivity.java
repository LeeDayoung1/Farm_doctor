package com.example.farmdoctor;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class foodcropActivity extends AppCompatActivity {
    public static String keyItemCode, keyKindCode, keyRanks, keyImage;

    String [] fcItemCodeList = {"_","152","152","152","152","152","152","152","152","152","152","152","152","152","152","151","151",
            "161","161","143","143","143","144","162","162","163", "163","111","111","111","111","164","164","112","112","141","141",
            "141","141","141","142","142","142"};

    String [] fcKindCodeList = {"_","00","00","01","01","02","02","03","03","04","04","05","05","06","06","00","00","01","01","00","00",
            "01","01","01","01","01","01","01","01","05","05", "01","01","01","01","01","01","03","02","02","00","00","01"};
    String [] fcRanksList = {"_", "상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품",
            "상품","중품","상품","중품","중품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품",
            "중품","상품","중품","상품","중품","중품"
    };
    String [] fcImageList = {"_", "potato","potato","potato","potato","potato","potato","potato","potato","potato","potato","potato",
            "potato","potato","potato","sweetpotato","sweetpotato","oat","oat","greenbean","greenbean","greenbean","buckwheat","barley",
            "barley","sorghumbicolor","sorghumbicolor","rice","rice","rice","rice","jobstears","jobstears","glutinousrice",
            "glutinousrice","beans","beans","beans","beansprouts","beansprouts","redbeans","redbeans","redbeans"};


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

        // 버튼들을 생성하고 클릭 이벤트 처리 함수 호출
        createButtons();
/*        // 'button1' 버튼 클릭 이벤트 처리
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyItemCode = fcItemCodeList[2];
                keyKindCode = fcKindCodeList[2];
                keyRanks = fcRanksList[2];
                keyImage = fcImageList[2];
                Intent intent = new Intent(foodcropActivity.this, guideFoodcropActivity.class);
                startActivity(intent);
            }
        });*/
    }

    // 버튼 생성 및 클릭 이벤트 처리 함수
    private void createButtons() {
        for (int i = 1; i <= 42; i++) {
            createButton(i);
        }
    }

    // 각 버튼의 생성 및 클릭 이벤트 처리 함수
    private void createButton(final int index) {
        Button button = findViewById(getResources().getIdentifier("button" + index, "id", getPackageName()));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyItemCode = fcItemCodeList[index];
                keyKindCode = fcKindCodeList[index];
                keyRanks = fcRanksList[index];
                keyImage = fcImageList[index];
                Intent intent = new Intent(foodcropActivity.this, guideFoodcropActivity.class);
                startActivity(intent);
            }
        });
    }
}
