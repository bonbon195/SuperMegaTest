package bonbon.supermegatest;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import bonbon.supermegatest.R;

public class ResultActivity extends AppCompatActivity {
    TextView score, appraisement;
    String finalScore, s;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        double points = getIntent().getIntExtra("points", 0);
        Log.d("mytag", String.valueOf(points));
        if (points>0){
            points = points/5*100;
        }
        finalScore= (int) points +"%";
        score = findViewById(R.id.score);
        score.setText(finalScore);
        appraisement = findViewById(R.id.appraisement);
        Log.d("mytag", String.valueOf(points));
        if (points >=80){
            s="Вы Молодец!";
        }else if (points>=40){
            s="Хорошо";
        }else{
            s="Вы старались!";
        }
        appraisement.setText(s);
    }
}
