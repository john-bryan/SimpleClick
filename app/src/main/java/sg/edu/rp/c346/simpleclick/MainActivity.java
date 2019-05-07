package sg.edu.rp.c346.simpleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.btnDisplay);
        etInput = findViewById(R.id.editTextInput);
        toggleButton = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                // Add your code for the action
                if (toggleButton.isChecked()) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }
            }
        });
    }
}