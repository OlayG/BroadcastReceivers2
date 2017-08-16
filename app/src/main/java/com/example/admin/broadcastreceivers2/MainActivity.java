package com.example.admin.broadcastreceivers2;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvGetBroadcast;
    MyBroadcastService myBroadcastService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvGetBroadcast = (TextView) findViewById(R.id.tvGetBroadcast);
    }

    @Override
    protected void onStart() {
        super.onStart();

        myBroadcastService = new MyBroadcastService(tvGetBroadcast);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("SendAction");
        registerReceiver(myBroadcastService, intentFilter);
    }
}
