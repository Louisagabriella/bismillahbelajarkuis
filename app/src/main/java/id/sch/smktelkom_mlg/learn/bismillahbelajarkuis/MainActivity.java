package id.sch.smktelkom_mlg.learn.bismillahbelajarkuis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    TextView textViewHasil1;
    TextView textView4;
    TextView textView6;
    TextView textView8;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        textViewHasil1 = (TextView) findViewById(R.id.textViewHasil1);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView8 = (TextView) findViewById(R.id.textView8);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doproses();

            }
        });
    }

    private void doproses() {
        int n = Integer.parseInt(editText1.getText().toString());
        String hasil = "";
        String jumlah = "";
        String yuhu = "";
        String sip = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                hasil += "* ";
            }
            hasil += "\n";
        }

        textViewHasil1.setText(hasil);

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                jumlah += "* ";
            }
            jumlah += "\n";
        }
        textView4.setText(jumlah);

        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                yuhu += " ";
            }
            for (int k = 1; k <= 1; k++) {
                yuhu += "* ";
            }
            for (int l = 1; l <= i - 1; l++) {
                yuhu += "* ";
            }
            yuhu += "\n";
        }
        textView6.setText(yuhu);


    }
}
