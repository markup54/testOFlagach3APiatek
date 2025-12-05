package pl.zabrze.zs10.testoflagach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ukryj(View view) {
        view.setVisibility(View.INVISIBLE);
    }

    public void ok(View view) {
        Toast.makeText(this, "ten kolor musi zostać we fladze Polski", Toast.LENGTH_SHORT).show();
    }
}