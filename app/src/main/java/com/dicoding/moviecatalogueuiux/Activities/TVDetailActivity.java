package com.dicoding.moviecatalogueuiux.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.moviecatalogueuiux.Data.TvShow;
import com.dicoding.moviecatalogueuiux.R;

public class TVDetailActivity extends AppCompatActivity {
    public static final String EXTRA_TV = "extra_tv";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvdetail);

        TvShow tvShow = getIntent().getParcelableExtra(EXTRA_TV);

        if (tvShow != null) {
            TextView txtTitle = findViewById(R.id.txt_title);
            TextView txtDescription = findViewById(R.id.txt_description);
            ImageView poster = findViewById(R.id.movie_poster);

            txtTitle.setText(tvShow.getTitle());
            txtDescription.setText(tvShow.getDescription());
            Glide.with(this)
                    .load(tvShow.getPoster())
                    .into(poster);
        }
    }
}

