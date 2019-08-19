package com.dicoding.moviecatalogueuiux.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.moviecatalogueuiux.Data.Movie;
import com.dicoding.moviecatalogueuiux.R;

public class MDetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdetail);

        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        if (movie != null) {
            TextView txtTitle = findViewById(R.id.txt_title);
            TextView txtDescription = findViewById(R.id.txt_description);
            ImageView imgPoster = findViewById(R.id.movie_poster);

            txtTitle.setText(movie.getTitle());
            txtDescription.setText(movie.getDescription());
            Glide.with(this)
                    .load(movie.getPoster())
                    .into(imgPoster);
        }
    }
}
