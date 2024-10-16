package pl.zabrze.zs10.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Pytanie> listaPytan = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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