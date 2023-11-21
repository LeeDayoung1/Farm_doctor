package com.example.farmdoctor;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MonthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.month);

        // '1월' 버튼 클릭 이벤트 처리
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'JanuaryActivity'를 시작하도록 변경
                Intent intent = new Intent(MonthActivity.this, JanuaryActivity.class);
                startActivity(intent);
            }
        });

        // '2월' 버튼 클릭 이벤트 처리
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'FebruaryActivity'를 시작하도록 변경
                Intent intent = new Intent(MonthActivity.this, FebruaryActivity.class);
                startActivity(intent);
            }
        });

        // '3월' 버튼 클릭 이벤트 처리
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MarchActivity'를 시작하도록 변경
                Intent intent = new Intent(MonthActivity.this, MarchActivity.class);
                startActivity(intent);
            }
        });

        // '4월' 버튼 클릭 이벤트 처리
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'AprilActivity'를 시작하도록 변경
                Intent intent = new Intent(MonthActivity.this, AprilActivity.class);
                startActivity(intent);
            }
        });

        // '5월' 버튼 클릭 이벤트 처리
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MayActivity'를 시작하도록 변경
                Intent intent = new Intent(MonthActivity.this, MayActivity.class);
                startActivity(intent);
            }
        });

        // '6월' 버튼 클릭 이벤트 처리
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'JuneActivity'를 시작하도록 변경
                Intent intent = new Intent(MonthActivity.this, JuneActivity.class);
                startActivity(intent);
            }
        });

        // '7월' 버튼 클릭 이벤트 처리
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'JulyActivity'를 시작하도록 변경
                Intent intent = new Intent(MonthActivity.this, JulyActivity.class);
                startActivity(intent);
            }
        });

        // '8월' 버튼 클릭 이벤트 처리
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'AugustActivity'를 시작하도록 변경
                Intent intent = new Intent(MonthActivity.this, AugustActivity.class);
                startActivity(intent);
            }
        });

        // '9월' 버튼 클릭 이벤트 처리
        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'SeptemberActivity'를 시작하도록 변경
                Intent intent = new Intent(MonthActivity.this, SeptemberActivity.class);
                startActivity(intent);
            }
        });

        // '10월' 버튼 클릭 이벤트 처리
        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'OctoberActivity'를 시작하도록 변경
                Intent intent = new Intent(MonthActivity.this, OctoberActivity.class);
                startActivity(intent);
            }
        });

        // '11월' 버튼 클릭 이벤트 처리
        Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'NovemberActivity'를 시작하도록 변경
                Intent intent = new Intent(MonthActivity.this, NovemberActivity.class);
                startActivity(intent);
            }
        });

        // '12월' 버튼 클릭 이벤트 처리
        Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'DecemberActivity'를 시작하도록 변경
                Intent intent = new Intent(MonthActivity.this, DecemberActivity.class);
                startActivity(intent);
            }
        });

        // 'homebutton' 버튼 클릭 이벤트 처리
        ImageButton homeButton = findViewById(R.id.homebutton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(MonthActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 'backbutton' 버튼 클릭 이벤트 처리
        ImageButton backButton = findViewById(R.id.backbutton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(MonthActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
