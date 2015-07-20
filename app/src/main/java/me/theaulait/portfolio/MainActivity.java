package me.theaulait.portfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotify = (Button) findViewById(R.id.spotify);
        Button scores = (Button) findViewById(R.id.scores);
        Button library = (Button) findViewById(R.id.library);
        Button bigger = (Button) findViewById(R.id.bigger);
        Button reader = (Button) findViewById(R.id.reader);
        Button myapp = (Button) findViewById(R.id.myapp);

        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getString(R.string.spotifytoast), Toast.LENGTH_LONG).show();
            }
        });

        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getString(R.string.scorestoast), Toast.LENGTH_SHORT).show();
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getString(R.string.librarytoast), Toast.LENGTH_SHORT).show();
            }
        });

        bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getString(R.string.biggertoast), Toast.LENGTH_SHORT).show();
            }
        });

        reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getString(R.string.readertoast), Toast.LENGTH_SHORT).show();
            }
        });

        myapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getString(R.string.myapptoast), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
