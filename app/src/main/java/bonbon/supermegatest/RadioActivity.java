package bonbon.supermegatest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import bonbon.supermegatest.R;

public class RadioActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    RadioGroup radioGroup;
    int points;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        points = getIntent().getIntExtra("points", 0);
        Log.d("mytag", String.valueOf(points));
        radioGroup = findViewById(R.id.radio_group);
        button = findViewById(R.id.radio_activity_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        Intent intent = new Intent(this, ResultActivity.class);
            if (checkedRadioButtonId == R.id.radio1){
                points = points + 1;
        }
        intent.putExtra("points", points);
        startActivity(intent);
    }
}
