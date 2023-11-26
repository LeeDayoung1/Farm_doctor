package com.example.farmdoctor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class recipeKindActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipekind);

        // '식량작물' 버튼 클릭 이벤트 처리
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'recipeFoodcropActivity'를 시작하도록 변경
                Intent intent = new Intent(recipeKindActivity.this, recipeFoodcropActivity.class);
                startActivity(intent);
            }
        });

        // '특용작물' 버튼 클릭 이벤트 처리
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'recipeSpecialcropActivity'를 시작하도록 변경
                Intent intent = new Intent(recipeKindActivity.this, recipeSpecialcropActivity.class);
                startActivity(intent);
            }
        });

        // '채소류' 버튼 클릭 이벤트 처리
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'recipeVegetableActivity'를 시작하도록 변경
                Intent intent = new Intent(recipeKindActivity.this, recipeVegetableActivity.class);
                startActivity(intent);
            }
        });

        // '과일류' 버튼 클릭 이벤트 처리
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'recipeFruitActivity'를 시작하도록 변경
                Intent intent = new Intent(recipeKindActivity.this, recipeFruitActivity.class);
                startActivity(intent);
            }
        });

        // 'homebutton' 버튼 클릭 이벤트 처리
        ImageButton homeButton = findViewById(R.id.homebutton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(recipeKindActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 'backbutton' 버튼 클릭 이벤트 처리
        ImageButton backButton = findViewById(R.id.backbutton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(recipeKindActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
