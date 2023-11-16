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
        Log.d("MainActivity", "onCreate");

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
    }
}
