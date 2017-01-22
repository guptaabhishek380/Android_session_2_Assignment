package com.example.admin.hideseek_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mImage;
    private Boolean mShowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton= (Button) findViewById(R.id.button);
        mImage= (TextView) findViewById(R.id.image1);
        mImage.setVisibility(View.VISIBLE);
        mShowing=true;
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mShowing){
                    mImage.setVisibility(View.INVISIBLE);
                    mButton.setText("Show");
                    mShowing=false;
                }
                else{
                    mButton.setText("Hide");
                    mShowing=true;
                    mImage.setVisibility(View.VISIBLE);
                }


            }
        });
    }


}
