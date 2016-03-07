package karen.game;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class EndGame extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);
        //this textview is used to display the score
        TextView tv=(TextView) findViewById(R.id.textView);
        //font for the textView
        Typeface tf=Typeface.createFromAsset(getAssets(),"StreetwiseBuddy.ttf");
        tv.setTypeface(tf);
        String score="";
        //gets the extra message sent from the play activity which is the score
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            score = extras.getString("score");
        }
        //changes the text to the score
        tv.setText(score);
    }
}
