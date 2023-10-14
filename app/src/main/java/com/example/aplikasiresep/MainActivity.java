package com.example.aplikasiresep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button detailBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main_activity);

        detailBtn = findViewById(R.id.detailBtn);


//        detailBtn.onClickListener{
//            Intent intent = new Intent(this, DetailActivity.class );
//            startActivity(intent);
//        }

        detailBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                startActivity(intent);
            }
        });

    }
//    override fun onCreate(savedInstanceState:Bundle?) {
//        super.onCreate(savedInstanceState)
//        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
//        setContentView(R.layout.main_activity)
//
//        detailBtn = findViewById(R.id.detailBtn)
//
//        detailBtn.setOnClickListener{
//            val intent = Intent(this@MainActivity2, DetailActivity::class.java )
//            startActivity(intent)
//        }
//    }
}
