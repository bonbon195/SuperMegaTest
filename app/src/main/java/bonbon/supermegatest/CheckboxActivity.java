package bonbon.supermegatest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import bonbon.supermegatest.R;

public class CheckboxActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6;
    int points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        checkBox4 = findViewById(R.id.checkbox4);
        checkBox5 = findViewById(R.id.checkbox5);
        checkBox6 = findViewById(R.id.checkbox6);
        points = getIntent().getIntExtra("points", 0);
        Log.d("mytag", String.valueOf(points));
        button = findViewById(R.id.checkbox_activity_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(CheckboxActivity.this, RadioActivity.class);
        if (checkBox2.isChecked()){
            points+=1;
        }
        if (checkBox4.isChecked()){
            points+=1;
        }
        if (checkBox6.isChecked()){
            points+=1;
        }
        intent.putExtra("points", points);
        startActivity(intent);
    }
}
