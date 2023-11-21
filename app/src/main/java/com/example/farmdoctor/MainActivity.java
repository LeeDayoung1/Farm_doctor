package com.example.farmdoctor;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MainActivity extends AppCompatActivity {

    TextView text, errorText;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView15);
        errorText = (TextView) findViewById(R.id.textView17);
        show = (Button) findViewById(R.id.button);

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

    class Task extends AsyncTask<Void, Void, Void> {
        String records = "", error = "";

        @Override
        protected Void doInBackground(Void...voids) {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://172.30.1.16:3306/farmer", "yeon", "jeongyeon");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM vegetable where item_code = 242");

                while(resultSet.next()){
                    records += resultSet.getString(2) + " " + resultSet.getString(6) + " "
                            + resultSet.getString(8) + " " + resultSet.getString(10) + " "
                            + resultSet.getString(12) + "\n";
/*                    for (int i=1;i<=12;i++) {
                        records += resultSet.getString(i) + " ";
                    }
                    records += "\n";*/
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
            if (error != "") {
                errorText.setText(error);
            }
            super.onPostExecute(aVoid);
        }
    }
}
