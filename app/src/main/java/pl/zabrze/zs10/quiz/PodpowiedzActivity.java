package pl.zabrze.zs10.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PodpowiedzActivity extends AppCompatActivity {
    private TextView tekst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podpowiedz);
        tekst = findViewById(R.id.textViewPodpowiedz);
        String mojaPodpowiedz = getIntent().getStringExtra("PODPOWIEDZ");
        tekst.setText("Podpowiedz: "+mojaPodpowiedz);
    }
}