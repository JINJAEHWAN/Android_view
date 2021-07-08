package com.example.androidview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //뷰의 주소 값을 담을 참조 변수
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //id 속성이 text2 인 뷰의 주소 값을 얻어 온다.
        text1 =(TextView)findViewById(R.id.text2);
        // 새로운 문자열을 설정한다.
        text1.setText("새로운 문자열");
    }
}