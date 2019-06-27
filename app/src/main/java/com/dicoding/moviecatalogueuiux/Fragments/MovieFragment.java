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
import com.dicoding.moviecatalogueuiux.Models.Movie;
import com.dicoding.moviecatalogueuiux.Models.MovieData;
import com.dicoding.moviecatalogueuiux.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment implements ListMovieAdapter.OnItemClickListener {
    private RecyclerView rvMovie;
    private ArrayList<Movie> listItemMovie = new ArrayList<>();


    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvMovie = view.findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);
        listItemMovie.addAll(MovieData.getListDataMov());
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
