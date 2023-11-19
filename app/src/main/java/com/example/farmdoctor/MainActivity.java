package com.example.farmdoctor;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // '식량작물' 버튼 클릭 이벤트 처리
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'foodcropActivity'를 시작하도록 변경
                Intent intent = new Intent(MainActivity.this, foodcropActivity.class);
                startActivity(intent);
            }
        });

        // '특용작물' 버튼 클릭 이벤트 처리
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'specialcropActivity'를 시작하도록 변경
                Intent intent = new Intent(MainActivity.this, specialcropActivity.class);
                startActivity(intent);
            }
        });

        // '채소류' 버튼 클릭 이벤트 처리
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'vegetableActivity'를 시작하도록 변경
                Intent intent = new Intent(MainActivity.this, vegetableActivity.class);
                startActivity(intent);
            }
        });

        // '과일류' 버튼 클릭 이벤트 처리
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'fruitActivity'를 시작하도록 변경
                Intent intent = new Intent(MainActivity.this, fruitActivity.class);
                startActivity(intent);
            }
        });

        // '제철농산물' 버튼 클릭 이벤트 처리
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MonthActivity'를 시작하도록 변경
                Intent intent = new Intent(MainActivity.this, MonthActivity.class);
                startActivity(intent);
            }
        });

        // '레시피' 버튼 클릭 이벤트 처리
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'recipekindActivity'를 시작하도록 변경
                Intent intent = new Intent(MainActivity.this, recipeKindActivity.class);
                startActivity(intent);
            }
        });


    }
}
