package com.example.farmdoctor;

import static com.example.farmdoctor.vegetableActivity.keyItemCode;
import static com.example.farmdoctor.vegetableActivity.keyKindCode;
import static com.example.farmdoctor.vegetableActivity.keyRanks;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class guideVegetableActivity extends AppCompatActivity {
    TextView dpr2, dpr3, dpr7, itemName, unit, ranks, errorText, tip;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide);

        dpr2 = (TextView) findViewById(R.id.textView4);
        dpr3 = (TextView) findViewById(R.id.textView7);
        dpr7 = (TextView) findViewById(R.id.textView10);

        itemName = (TextView) findViewById(R.id.textView);
        unit = (TextView) findViewById(R.id.textView15);
        ranks = (TextView) findViewById(R.id.textView20);
        errorText = (TextView) findViewById(R.id.textView18);
        //tip = (TextView) findViewById(R.id.textView14);


        new guideVegetableActivity.Task().execute();

        // 'homebutton' 버튼 클릭 이벤트 처리
        ImageButton homeButton = findViewById(R.id.homebutton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(guideVegetableActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 'backbutton' 버튼 클릭 이벤트 처리
        ImageButton backButton = findViewById(R.id.backbutton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'vegetableActivity'로 이동
                Intent intent = new Intent(guideVegetableActivity.this, vegetableActivity.class);
                startActivity(intent);
            }
        });
    }

    class Task extends AsyncTask<Void, Void, Void> {
        String redpr2 = "", redpr3 = "", redpr7 = "", reitemName = "", reunit = "", reranks = "", reerror = "", retip = "";

        @Override
        protected Void doInBackground(Void...voids) {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://172.30.1.16:3306/farmer", "yeon", "jeongyeon");
                Statement statement = connection.createStatement();

                ResultSet resultSet_dpr2 = statement.executeQuery("SELECT dpr2 FROM vegetable WHERE item_code = '" + keyItemCode + "' AND kind_code = '" + keyKindCode + "' AND ranks = '" + keyRanks + "'");
                while(resultSet_dpr2.next()){
                    redpr2 += resultSet_dpr2.getString(1) ;
                }

                ResultSet resultSet_dpr3 = statement.executeQuery("SELECT dpr3 FROM vegetable WHERE item_code = '" + keyItemCode + "' AND kind_code = '" + keyKindCode + "' AND ranks = '" + keyRanks + "'");
                while(resultSet_dpr3.next()){
                    redpr3 += resultSet_dpr3.getString(1);
                }

                ResultSet resultSet_dpr7 = statement.executeQuery("SELECT dpr7 FROM vegetable WHERE item_code = '" + keyItemCode + "' AND kind_code = '" + keyKindCode + "' AND ranks = '" + keyRanks + "'");
                while(resultSet_dpr7.next()){
                    redpr7 += resultSet_dpr7.getString(1);
                }

                ResultSet resultSet_itemName = statement.executeQuery("SELECT item_name, kind_name FROM vegetable WHERE item_code = '" + keyItemCode + "' AND kind_code = '" + keyKindCode + "' AND ranks = '" + keyRanks + "'");
                while(resultSet_itemName.next()){
                    reitemName += resultSet_itemName.getString(1) + " " + resultSet_itemName.getString(2);
                }

                ResultSet resultSet_unit = statement.executeQuery("SELECT unit FROM vegetable WHERE item_code = '" + keyItemCode + "' AND kind_code = '" + keyKindCode + "' AND ranks = '" + keyRanks + "'");
                while(resultSet_unit.next()){
                    reunit += resultSet_unit.getString(1);
                }

                ResultSet resultSet_ranks = statement.executeQuery("SELECT ranks FROM vegetable WHERE item_code = '" + keyItemCode + "' AND kind_code = '" + keyKindCode + "' AND ranks = '" + keyRanks + "'");
                while(resultSet_ranks.next()){
                    reranks += resultSet_ranks.getString(1);
                }
            }
            catch(Exception e){
                reerror = e.toString();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Log.d("MySQLAsyncTask", "onPostExecute: ");
            dpr2.setText(redpr2);
            dpr3.setText(redpr3);
            dpr7.setText(redpr7);
            itemName.setText(reitemName);
            unit.setText(reunit);
            ranks.setText(reranks);
            if (reerror != "") {
                errorText.setText(reerror);
            }
            super.onPostExecute(aVoid);
        }
    }
}
