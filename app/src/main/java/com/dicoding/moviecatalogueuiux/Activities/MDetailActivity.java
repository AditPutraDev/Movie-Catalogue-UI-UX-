package com.dicoding.moviecatalogueuiux.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.moviecatalogueuiux.Models.Movie;
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
            txtTitle.setText(movie.getTitle());
            TextView txtDesc = findViewById(R.id.txt_description);
            txtDesc.setText(movie.getDescription());
            ImageView imgView = findViewById(R.id.movie_poster);
            Glide.with(this)
                    .load(movie)
                    .apply(new RequestOptions().override(55, 55))
                    .into(imgView);
        }
    }
}
