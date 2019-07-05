package com.dicoding.moviecatalogueuiux.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dicoding.moviecatalogueuiux.Adapters.ListMovieAdapter;
import com.dicoding.moviecatalogueuiux.Data.Movie;
import com.dicoding.moviecatalogueuiux.Data.MovieData;
import com.dicoding.moviecatalogueuiux.R;

import java.util.ArrayList;

public class MovieFragment extends Fragment implements ListMovieAdapter.OnItemClickListener {
    private RecyclerView rvMovie;
    private ArrayList<Movie> listItemMovie = new ArrayList<>();


    public MovieFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvMovie = view.findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);
        listItemMovie.addAll(MovieData.getListMovies());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMovie.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(getContext());
        listMovieAdapter.setListMovie(listItemMovie);
        rvMovie.setAdapter(listMovieAdapter);
    }

    @Override
    public void onItemClick(int position) {
    }
}
