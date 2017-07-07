package sh.nothing.crasho;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCrashClick(View view) {
        NotificationChannel nc = new NotificationChannel("notification", "crash notification", NotificationManager.IMPORTANCE_DEFAULT);
        nc.setVibrationPattern(new long[0]);
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.createNotificationChannel(nc);
    }
}
