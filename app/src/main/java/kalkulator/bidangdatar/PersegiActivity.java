package kalkulator.bidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersegiActivity extends AppCompatActivity {

    private EditText stext;
    private EditText hasil;
    private Button luas;
    private Button keliling;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        stext = (EditText) findViewById(R.id.stext);
        hasil = (EditText) findViewById(R.id.hasil);
        luas = (Button) findViewById(R.id.luas);
        keliling = (Button) findViewById(R.id.keliling);

        back =(Button) findViewById(R.id.kembali);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PersegiActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
    public void luaspersegi(View view) {
        try {

            int s = Integer.parseInt(stext.getText().toString());
            double luas = s * s;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kelilingpersegi(View view) {
        try {

            int s = Integer.parseInt(stext.getText().toString());
            double keliling = 4 * s;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}