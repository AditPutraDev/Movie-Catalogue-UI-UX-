package com.dicoding.moviecatalogueuiux.Activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.dicoding.moviecatalogueuiux.Adapters.ListMovieAdapter;
import com.dicoding.moviecatalogueuiux.Models.Movie;
import com.dicoding.moviecatalogueuiux.Models.MovieData;
import com.dicoding.moviecatalogueuiux.R;
import com.dicoding.moviecatalogueuiux.Fragments.MovieFragment;
import com.dicoding.moviecatalogueuiux.Fragments.TvShowFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMovie;
    private ArrayList<Movie> listItemMovie = new ArrayList<>();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment fragment;

            switch (item.getItemId()) {
                case R.id.navigation_movie:
                    fragment = new MovieFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.navigation_tv_show:
                    fragment = new TvShowFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovie = findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        listItemMovie.addAll(MovieData.getListDataMov());
        showRecyclerList();

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        if (savedInstanceState == null) {
            navView.setSelectedItemId(R.id.navigation_movie);
        }
    }

    private void showRecyclerList() {
        rvMovie.setLayoutManager(new LinearLayoutManager(this));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(this);
        listMovieAdapter.setListMovie(listItemMovie);
        rvMovie.setAdapter(listMovieAdapter);
    }

}
