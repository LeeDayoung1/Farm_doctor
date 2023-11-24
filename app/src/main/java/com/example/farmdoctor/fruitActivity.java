package com.example.farmdoctor;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class fruitActivity extends AppCompatActivity {

    public static String keyItemCode, keyKindCode, keyRanks, keyImage;

    String [] fItemCodeList = {"_", "415", "415", "415", "415", "415", "415", "416", "416", "424", "424", "418", "418", "428", "428", "412", "412", "412", "412", "412", "412", "412", "412", "413", "413", "413", "413", "413", "413", "411", "411", "411", "411", "411",
            "411", "411", "411", "421", "421", "421", "421", "421", "421", "421", "421", "421", "421", "419", "419", "419", "419", "425", "425", "420", "420", "414", "414", "414", "414", "414", "414", "414", "414", "414", "414", "414", "414"
    };

    String [] fKindCodeList = {"_", "00", "00", "01", "01", "02", "02", "00", "00", "00", "00", "02", "02", "00", "00", "01", "01", "02", "02", "03", "03", "04", "04", "01", "01", "04", "04", "05", "05", "01", "01", "05", "05", "06", "06", "07", "07", "02", "02", "03", "03", "04", "04", "05", "05", "06", "06", "01", "01", "02", "02", "00", "00", "02", "02", "01", "01", "02", "02", "03", "03", "06", "06", "07", "07", "12", "12"
    };
    String [] fRanksList = {"_", "상품","중품","S과","M과","S과","M과","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","L과","M과","L과","M과","상품","중품","L과","M과","상품","중품","L과","M과"
    };
    String [] fImageList = {"_", "tangerine", "tangerine", "tangerine", "tangerine", "tangerine", "tangerine", "persimmon", "persimmon", "lemon", "lemon", "banana", "banana", "mango", "mango", "pear", "pear", "pear", "pear", "pear", "pear", "pear", "pear", "whiteprunuspersica", "whiteprunuspersica", "prunuspersica", "prunuspersica", "prunuspersica", "prunuspersica", "apple", "apple", "apple", "apple", "apple", "apple", "apple", "apple", "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange", "kiwi", "kiwi", "kiwi", "kiwi", "cherry", "cherry", "pineapple", "pineapple", "grape", "grape", "grape", "grape", "grape", "grape", "grape", "grape", "grape", "grape", "shinemuscat", "shinemuscat"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruit_page_1);

        // 'homebutton' 버튼 클릭 이벤트 처리
        ImageButton homeButton = findViewById(R.id.homebutton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(fruitActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 'backbutton' 버튼 클릭 이벤트 처리
        ImageButton backButton = findViewById(R.id.backbutton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(fruitActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 버튼들을 생성하고 클릭 이벤트 처리 함수 호출
        createButtons();
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
                keyItemCode = fItemCodeList[index];
                keyKindCode = fKindCodeList[index];
                keyRanks = fRanksList[index];
                keyImage = fImageList[index];
                Intent intent = new Intent(fruitActivity.this, guideFruitActivity.class);
                startActivity(intent);
            }
        });
    }
}
