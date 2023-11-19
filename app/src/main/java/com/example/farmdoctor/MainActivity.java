package com.example.farmdoctor;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.bannerTextView);
        show = (Button) findViewById(R.id.button6);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task().execute();
            }
        });

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

/*
        // '레시피' 버튼 클릭 이벤트 처리
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'recipeActivity'를 시작하도록 변경
                Intent intent = new Intent(MainActivity.this, recipeActivity.class);
                startActivity(intent);
            }
        });
*/


    }

    class Task extends AsyncTask<Void, Void, Void> {
        String records = "", error = "";

        @Override
        protected Void doInBackground(Void...voids) {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.0.39:3306/farmer", "yeon", "jeongyeon");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("USE farmer SELECT category FROM category WHERE category_code = 100");

                while(resultSet.next()){
                    records = resultSet.getString(1);
                }
            }
            catch(Exception e){
                error = e.toString();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Log.d("MySQLAsyncTask", "onPostExecute: " + records);
            text.setText(records);
            super.onPostExecute(aVoid);
        }


    }
}
