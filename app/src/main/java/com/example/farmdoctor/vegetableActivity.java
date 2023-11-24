package com.example.farmdoctor;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class vegetableActivity extends AppCompatActivity {
    public static String keyItemCode, keyKindCode, keyRanks, keyImage;

    String [] vItemCodeList = {"_","251","251","258","258","258","258","258","258","258","258","258","258","259","259","259","253","253","241","241","241","241","241","232","232","232","232","232","232","232","226","226","257","257","231","231","231","231","231","231","231","231","252","252","422","422","422","422","211","211","211","211","211","211","211","211","254","254","243","243","280","280","214","214","214","214","247","247","247","221","221","213","213","279","279","212","212","245","245","245","245","245","215","215","233","233","223","223","223","223","223","223","222","222","225","225","246","246","246","246","256","256","242","242","242","242","242","242","242","242","244","244","244","244","244","244","244","244","244","244","244","244","244","244","244","244","244","244","244","244","244","244","255","255","224","224","224","224"
    };

    String [] vKindCodeList = {"_","04","05","04","05","04","05","04","05","04","05","04","05","05","04","05","04","05","04","05","04","05","05","04","05","04","05","04","05","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","05","04","05","04","05","04","05","04","05","04","05","04","05","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05","04","05"
    };
    String [] vRanksList = {"_","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","중품","상품","중품","상품","중품","상품","중품","상품","중품","중품","상품","중품","상품","중품","상품","중품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품","상품","중품"
    };
    String [] vImageList = {"_","eggplant","eggplant","peeledgarlic","peeledgarlic","peeledgarlic","peeledgarlic","peeledgarlic","peeledgarlic","peeledgarlic","peeledgarlic","peeledgarlic","peeledgarlic","peeledgarlic","peeledgarlic","peeledgarlic","perillaleaf","perillaleaf","driedredpepper","driedredpepper","driedredpepper","driedredpepper","driedredpepper","carrot","carrot","carrot","carrot","carrot","carrot","carrot","strawberry","strawberry","melon","melon","daikon","daikon","daikon","daikon","daikon","daikon","daikon","daikon","waterparsely","waterparsely","cheerytomato","cheerytomato","cheerytomato","cheerytomato","napacabbage","napacabbage","napacabbage","napacabbage","napacabbage","napacabbage","wintercabbage","wintercabbage","chives","chives","cayenne","cayenne","broccoli","broccoli","leaflettuce","leaflettuce","leaflettuce","leaflettuce","ginger","ginger","ginger","watermelon","watermelon","spinach","spinach","roecabbage","roecabbage","cabbage","cabbage","onion","onion","onion","onion","onion","groundcabbage","groundcabbage","youngradish","youngradish","cucumber","cucumber","cucumber","cucumber","cucumber","cucumber","orientalmelon","orientalmelon","tomato","tomato","welshonion","welshonion","welshonion","welshonion","paprika","paprika","greenchillipepper","greenchillipepper","greenchillipepper","greenchillipepper","greenchillipepper","greenchillipepper","greenchillipepper","greenchillipepper","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","garlic","bellpepper","bellpepper","courgette","courgette","zucchini","zucchini"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegetable_page_1);

        // 'homebutton' 버튼 클릭 이벤트 처리
        ImageButton homeButton = findViewById(R.id.homebutton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'vegetableActivity'로 이동
                Intent intent = new Intent(vegetableActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 'backbutton' 버튼 클릭 이벤트 처리
        ImageButton backButton = findViewById(R.id.backbutton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(vegetableActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 버튼들을 생성하고 클릭 이벤트 처리 함수 호출
        createButtons();
    }

    // 버튼 생성 및 클릭 이벤트 처리 함수
    private void createButtons() {
        for (int i = 1; i <= 137; i++) {
            createButton(i);
        }
    }

    // 각 버튼의 생성 및 클릭 이벤트 처리 함수
    private void createButton(final int index) {
        Button button = findViewById(getResources().getIdentifier("button" + index, "id", getPackageName()));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyItemCode = vItemCodeList[index];
                keyKindCode = vKindCodeList[index];
                keyRanks = vRanksList[index];
                keyImage = vImageList[index];
                Intent intent = new Intent(vegetableActivity.this, guideVegetableActivity.class);
                startActivity(intent);
            }
        });
    }
}

