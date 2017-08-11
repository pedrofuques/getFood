package com.example.pedrofuques.pureorder;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    private Handler mWaitHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWaitHandler.postDelayed(new Runnable() {

            @Override
            public void run() {

                try {

                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                    finish();  // Finish splash activity since it is no more needed
                } catch (Exception ignored) {
                    ignored.printStackTrace();
                }
            }
        }, 3000);  // 5 seconds
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mWaitHandler.removeCallbacksAndMessages(null);
    }
}
