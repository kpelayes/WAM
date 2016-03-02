package karen.game;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;



public class Play extends AppCompatActivity {
    private int s=0;
    private TextView time;
    private CountDownTimer countDownTimer;
    private final long startTime = 45 * 1000;
    private final long interval = 1 * 1000;
    //private TextView time=(TextView) findViewById(R.id.timer);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        time=(TextView) findViewById(R.id.timer);
        countDownTimer = new MyCountDownTimer(startTime, interval);
        countDownTimer.start();

    }
    public class MyCountDownTimer extends CountDownTimer {
        public MyCountDownTimer(long startTime, long interval) {
            super(startTime, interval);
        }
        @Override
        public void onFinish() {
            time.setText("Time's up!");
        }
        public void onTick(long millisUntilFinished) {
            time.setText("0:" + millisUntilFinished / 1000);
        }
    }
    public void incrementScore(View v) {
        s++;
        TextView tv=(TextView) findViewById(R.id.score);
        tv.setText(s + "");
        ImageButton ibutton=(ImageButton) findViewById(v.getId());
        ibutton.setImageResource(R.drawable.molehill);
    }

}
