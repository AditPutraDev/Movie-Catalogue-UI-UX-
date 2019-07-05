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

import com.dicoding.moviecatalogueuiux.Adapters.ListTvShowAdapter;
import com.dicoding.moviecatalogueuiux.Data.TvShow;
import com.dicoding.moviecatalogueuiux.Data.TvShowData;
import com.dicoding.moviecatalogueuiux.R;

import java.util.ArrayList;

public class TvShowFragment extends Fragment implements ListTvShowAdapter.OnItemClickListener {
    private RecyclerView rvTvShow;
    private ArrayList<TvShow> listItemTV = new ArrayList<>();

    public TvShowFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tv_show, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvTvShow = view.findViewById(R.id.rv_tvshow);
        rvTvShow.setHasFixedSize(true);
        listItemTV.addAll(TvShowData.getListDataTvShow());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTvShow.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListTvShowAdapter listTvShowAdapter = new ListTvShowAdapter(getContext());
        listTvShowAdapter.setListTvShow(listItemTV);
        rvTvShow.setAdapter(listTvShowAdapter);
    }

    @Override
    public void onItemClick(int position) {

    }
}

