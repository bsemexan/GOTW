package com.example.android.gotw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Find the View that shows the genres category
        TextView genres = (TextView) findViewById(R.id.genre);

// Set a click listener on that View
        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the genre View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(getApplicationContext(), GenreActivity.class);
                startActivity(genresIntent);
            }
        });


        // Find the View that shows the numbers category
        TextView artists = (TextView) findViewById(R.id.artist);

// Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(getApplicationContext(), ArtistActivity.class);
                startActivity(artistsIntent);
            }
        });

        TextView discovery = (TextView) findViewById(R.id.discovery);

        // Set a click listener on that View
        discovery.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the discovery category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DiscoveryActivity}
                Intent discoveryIntent = new Intent(getApplicationContext(), DiscoveryActivity.class);
                startActivity(discoveryIntent);
            }
        });

    }

}
