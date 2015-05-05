package androidmpos.inapp.com.androidmpos;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;



public class SplashActivity extends ActionBarActivity {

    private  static int SPLASH_DISPLAY_TIME = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent i = new Intent(SplashActivity.this,LoginActivity.class);
               startActivity(i);
               finish();

           }
       },SPLASH_DISPLAY_TIME);
    }



}
