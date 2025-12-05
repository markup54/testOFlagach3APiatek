package pl.zabrze.zs10.testoflagach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int licznikPrzyciskow;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewPolecenie);
    }

    public void ukryj(View view) {
        view.setVisibility(View.INVISIBLE);
        licznikPrzyciskow++;
        if(licznikPrzyciskow == 4){
            //Toast.makeText(this, "Brawo to jest flaga Polski", Toast.LENGTH_SHORT).show();
            textView.setText("Brawo to jest flaga Polski!");
        }
    }

    public void ok(View view) {
        Toast.makeText(this, "ten kolor musi zostać we fladze Polski", Toast.LENGTH_SHORT).show();
    }
}