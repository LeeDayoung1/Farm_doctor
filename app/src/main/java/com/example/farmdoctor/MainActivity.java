package com.example.farmdoctor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.farmdoctor.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 'activity_main.xml' 레이아웃을 표시
        setContentView(R.layout.activity_main);

        // '제철농산물' 버튼 클릭 이벤트 처리
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'month.xml' 레이아웃을 표시
                setContentView(R.layout.month);
            }
        });
    }
}
