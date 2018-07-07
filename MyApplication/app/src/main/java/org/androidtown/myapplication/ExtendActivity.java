package org.androidtown.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ExtendActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend);


        Button btn = findViewById(R.id.extend);

        btn.setOnClickListener(new View.OnClickListener(){ //자전거 반납
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), Borrow2Activity.class);
                startActivity(intent);
            }
        });


    }

}
