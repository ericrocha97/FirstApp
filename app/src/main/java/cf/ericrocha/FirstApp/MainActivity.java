package cf.ericrocha.FirstApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonLimpar;
    private Button buttonConfirmar;
    private EditText editText;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLimpar = findViewById(R.id.buttonLimpar);
        buttonConfirmar = findViewById(R.id.buttonConfirmar);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
                textView.setText(getText(R.string.text_padrao));
            }
        });
    }

    public void confirm(View view){
        textView.setText(editText.getText());
    }
}
