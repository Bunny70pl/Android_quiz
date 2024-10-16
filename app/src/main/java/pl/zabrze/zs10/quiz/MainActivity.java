package pl.zabrze.zs10.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Pytanie> listaPytan = new ArrayList<>();
    private TextView textView;
    private int nrPytania;
    private Button nastepny;
    private Button tak;
    private Button nie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wypelnijPytania();
        textView = findViewById(R.id.textViewTrescPytania);
        nrPytania = 0;
        wstawPytanie(nrPytania);
        nastepny = findViewById(R.id.button4);
        tak = findViewById(R.id.button);
        nie = findViewById(R.id.button2);
        nastepny.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nrPytania++;
                        if(nrPytania == listaPytan.size()){
                            nastepny.setVisibility(View.INVISIBLE);
                            tak.setVisibility(View.INVISIBLE);
                            nie.setVisibility(View.INVISIBLE);
                            textView.setText("Zdobyłeś: "+ policzPuntky() +" na " + listaPytan.size());
                        }else{
                            wstawPytanie(nrPytania);
                        }
                    }
                }
        );
        tak.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sprawdzToPytanie(true);
                    }
                }
        );
        nie.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sprawdzToPytanie(false);
                    }
                }
        );
    }
    private int policzPuntky(){
        int ilePunktow = 0;
        for (Pytanie pytanie:listaPytan) {
            if(pytanie.isUdzielnoPoprawnaOdpowiedz()){
                ilePunktow++;
            }
        }
        return ilePunktow;
    }
    private void sprawdzToPytanie(boolean odpowiedzUzytkownika){
        listaPytan.get(nrPytania).setUdzielnoPoprawnaOdpowiedz(false);
        if(listaPytan.get(nrPytania).isPoprawna() == odpowiedzUzytkownika){
            listaPytan.get(nrPytania).setUdzielnoPoprawnaOdpowiedz(true);
        }
    }
    private void wstawPytanie(int i){
        Pytanie pytanie = listaPytan.get(i);
        textView.setText(pytanie.getTresc());
    }
    private void wypelnijPytania(){
        listaPytan.add(new Pytanie(
                "Czy sekwoja moze miec 100 metrow wyokosci",
                "Sejwoje sa bardzo wysokie",
                true
                ));
        listaPytan.add(new Pytanie(
                "Czy najgrubsze drzewo ma obwod 10m",
                "obwod najgrubszego pnia na swiecei ma 44m",
                false
                ));
        listaPytan.add(new Pytanie(
                "Czy drzewa sa pochlaniaczem tlenu",
                "Zastanow sie na czym polega fotostynteza",
                false
                ));
    }
}