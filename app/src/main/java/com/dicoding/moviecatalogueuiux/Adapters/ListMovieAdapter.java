package com.dicoding.moviecatalogueuiux.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.moviecatalogueuiux.Activities.MDetailActivity;
import com.dicoding.moviecatalogueuiux.Models.Movie;
import com.dicoding.moviecatalogueuiux.R;

import java.util.ArrayList;

public class ListMovieAdapter extends RecyclerView.Adapter<ListMovieAdapter.CategoryViewHolder> {
    private Context context;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public ArrayList<Movie> getListMovie() {
        return listMovie;
    }

    public ListMovieAdapter(Context context) {
        this.context = context;
    }

    private ArrayList<Movie> listMovie;

    public void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_movie, viewGroup, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, final int position) {
        holder.tvTitle.setText(getListMovie().get(position).getTitle());
        holder.tvDesc.setText(getListMovie().get(position).getDescription()
        );
        Glide.with(context)
                .load(getListMovie().get(position).getPoster())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPoster);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "" + getListMovie().get(position).getTitle(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, MDetailActivity.class);
                intent.putParcelableArrayListExtra("extra_movie", getListMovie());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListMovie().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvDesc;
        ImageView imgPoster;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_item_titlem);
            tvDesc = itemView.findViewById(R.id.tv_item_descm);
            imgPoster = itemView.findViewById(R.id.image_poster);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
