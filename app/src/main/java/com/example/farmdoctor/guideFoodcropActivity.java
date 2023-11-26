package com.example.farmdoctor;

import static com.example.farmdoctor.foodcropActivity.keyItemCode;
import static com.example.farmdoctor.foodcropActivity.keyKindCode;
import static com.example.farmdoctor.foodcropActivity.keyRanks;
import static com.example.farmdoctor.foodcropActivity.keyImage;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class guideFoodcropActivity extends AppCompatActivity {

    TextView day2, day3, day7, dpr2, dpr3, dpr7, itemName, unit, ranks, errorText, tip;
    ImageView image;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide);

        day2 = (TextView) findViewById(R.id.textView3);
        day3 = (TextView) findViewById(R.id.textView6);
        day7 = (TextView) findViewById(R.id.textView9);
        dpr2 = (TextView) findViewById(R.id.textView4);
        dpr3 = (TextView) findViewById(R.id.textView7);
        dpr7 = (TextView) findViewById(R.id.textView10);

        itemName = (TextView) findViewById(R.id.textView);
        unit = (TextView) findViewById(R.id.textView15);
        ranks = (TextView) findViewById(R.id.textView20);
        errorText = (TextView) findViewById(R.id.textView18);
        tip = (TextView) findViewById(R.id.textView14);
        image = (ImageView) findViewById(R.id.imageView);

        new guideFoodcropActivity.Task().execute();

        // 'homebutton' 버튼 클릭 이벤트 처리
        ImageButton homeButton = findViewById(R.id.homebutton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(guideFoodcropActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 'backbutton' 버튼 클릭 이벤트 처리
        ImageButton backButton = findViewById(R.id.backbutton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'foodcropActivity'로 이동
                Intent intent = new Intent(guideFoodcropActivity.this, foodcropActivity.class);
                startActivity(intent);
            }
        });
    }

    class Task extends AsyncTask<Void, Void, Void> {
        String reday2 = "", reday3 = "", reday7 = "", redpr2 = "", redpr3 = "", redpr7 = "", reitemName = "",
                reunit = "", reranks = "", reerror = "", retip = "";

        @Override
        protected Void doInBackground(Void...voids) {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://172.30.1.34:3306/farmer", "yeon", "jeongyeon");
                Statement statement = connection.createStatement();

                ResultSet resultSet_day2 = statement.executeQuery("SELECT day2 FROM foodcrop WHERE item_code = '" + foodcropActivity.keyItemCode + "' AND kind_code = '" + foodcropActivity.keyKindCode + "' AND ranks = '" + foodcropActivity.keyRanks + "'");
                while(resultSet_day2.next()){
                    reday2 += resultSet_day2.getString(1) ;
                }

                ResultSet resultSet_day3 = statement.executeQuery("SELECT day3 FROM foodcrop WHERE item_code = '" + foodcropActivity.keyItemCode + "' AND kind_code = '" + foodcropActivity.keyKindCode + "' AND ranks = '" + foodcropActivity.keyRanks + "'");
                while(resultSet_day3.next()){
                    reday3 += resultSet_day3.getString(1);
                }

                ResultSet resultSet_day7 = statement.executeQuery("SELECT day7 FROM foodcrop WHERE item_code = '" + foodcropActivity.keyItemCode + "' AND kind_code = '" + foodcropActivity.keyKindCode + "' AND ranks = '" + foodcropActivity.keyRanks + "'");
                while(resultSet_day7.next()){
                    reday7 += resultSet_day7.getString(1);
                }

                ResultSet resultSet_dpr2 = statement.executeQuery("SELECT dpr2 FROM foodcrop WHERE item_code = '" + foodcropActivity.keyItemCode + "' AND kind_code = '" + foodcropActivity.keyKindCode + "' AND ranks = '" + foodcropActivity.keyRanks + "'");
                while(resultSet_dpr2.next()){
                    redpr2 += resultSet_dpr2.getString(1) ;
                }

                ResultSet resultSet_dpr3 = statement.executeQuery("SELECT dpr3 FROM foodcrop WHERE item_code = '" + foodcropActivity.keyItemCode + "' AND kind_code = '" + foodcropActivity.keyKindCode + "' AND ranks = '" + foodcropActivity.keyRanks + "'");
                while(resultSet_dpr3.next()){
                    redpr3 += resultSet_dpr3.getString(1);
                }

                ResultSet resultSet_dpr7 = statement.executeQuery("SELECT dpr7 FROM foodcrop WHERE item_code = '" + foodcropActivity.keyItemCode + "' AND kind_code = '" + foodcropActivity.keyKindCode + "' AND ranks = '" + foodcropActivity.keyRanks + "'");
                while(resultSet_dpr7.next()){
                    redpr7 += resultSet_dpr7.getString(1);
                }

                ResultSet resultSet_itemName = statement.executeQuery("SELECT item_name, kind_name FROM foodcrop WHERE item_code = '" + foodcropActivity.keyItemCode + "' AND kind_code = '" + foodcropActivity.keyKindCode + "' AND ranks = '" + foodcropActivity.keyRanks + "'");
                while(resultSet_itemName.next()){
                    reitemName += resultSet_itemName.getString(1) + " " + resultSet_itemName.getString(2);
                }

                ResultSet resultSet_unit = statement.executeQuery("SELECT unit FROM foodcrop WHERE item_code = '" + foodcropActivity.keyItemCode + "' AND kind_code = '" + foodcropActivity.keyKindCode + "' AND ranks = '" + foodcropActivity.keyRanks + "'");
                while(resultSet_unit.next()){
                    reunit += resultSet_unit.getString(1);
                }

                ResultSet resultSet_ranks = statement.executeQuery("SELECT ranks FROM foodcrop WHERE item_code = '" + foodcropActivity.keyItemCode + "' AND kind_code = '" + foodcropActivity.keyKindCode + "' AND ranks = '" + foodcropActivity.keyRanks + "'");
                while(resultSet_ranks.next()){
                    reranks += resultSet_ranks.getString(1);
                }

                ResultSet resultSet_tip = statement.executeQuery("SELECT tip FROM tips WHERE item_code = '" + foodcropActivity.keyItemCode + "'");
                while(resultSet_tip.next()){
                    retip += resultSet_tip.getString(1);
                }
                reerror = "";
            }
            catch(Exception e){
                reerror = e.toString();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Log.d("MySQLAsyncTask", "onPostExecute: ");
            day2.setText(reday2);
            day3.setText(reday3);
            day7.setText(reday7);
            dpr2.setText(redpr2);
            dpr3.setText(redpr3);
            dpr7.setText(redpr7);
            itemName.setText(reitemName);
            unit.setText(reunit);
            ranks.setText(reranks);
            tip.setText(retip);
            errorText.setText(reerror);
            image.setImageResource(getResources().getIdentifier(keyImage, "drawable", getPackageName()));

            super.onPostExecute(aVoid);
        }
    }
}
