package nutsackles.splashactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashSccreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_sccreen);
        LogoLauncher a =new LogoLauncher();
        a.start();
    }

    private class LogoLauncher extends Thread {
        public void run() {
            try {
                sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
            Intent intent=new Intent(SplashSccreenActivity.this,MainActivity.class);
            startActivity(intent);
            SplashSccreenActivity.this.finish();
        }

    }
}