package com.example.hacunamatata.rikkeisoft_broadcasrreceiver_b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadcastB extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("From Sender to B", intent.getAction());
        Log.d("From Sender to B", intent.getStringExtra("Message to B"));
        Intent i = new Intent(context, SubBActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
