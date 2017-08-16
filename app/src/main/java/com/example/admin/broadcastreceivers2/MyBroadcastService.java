package com.example.admin.broadcastreceivers2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Admin on 8/15/2017.
 */

public class MyBroadcastService extends BroadcastReceiver {

    TextView tvGetAction;

    public MyBroadcastService(TextView tvGetAction) {
        this.tvGetAction = tvGetAction;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        switch (intent.getAction()){

            case "SendAction":
                Toast.makeText(context, "I GOT IT", Toast.LENGTH_SHORT).show();
                tvGetAction.setText(intent.getStringExtra("data"));
                break;
        }
    }
}
