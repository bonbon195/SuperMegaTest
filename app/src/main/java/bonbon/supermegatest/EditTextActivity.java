package bonbon.supermegatest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import bonbon.supermegatest.R;

public class EditTextActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    EditText editText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.edit_text_activity_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(EditTextActivity.this, CheckboxActivity.class);
        String answer = editText.getText().toString();
        Log.d("mytag", answer);
        if (answer.equalsIgnoreCase("final")){
            intent.putExtra("points", 1);
        }
        startActivity(intent);
    }
}
