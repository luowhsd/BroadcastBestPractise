package com.example.fangl.broadcastbestpractise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    private Button button_Offline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_Offline = (Button)findViewById(R.id.logout);
        button_Offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.fangl.broadcastbestpractise.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });
    }
}
