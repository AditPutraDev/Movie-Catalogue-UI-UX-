package com.dicoding.moviecatalogueuiux.Adapters;

import android.content.Context;
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
import com.dicoding.moviecatalogueuiux.Data.TvShow;
import com.dicoding.moviecatalogueuiux.R;

import java.util.ArrayList;

public class ListTvShowAdapter extends RecyclerView.Adapter<ListTvShowAdapter.CategoryViewHolder> {
    private Context context;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    private ArrayList<TvShow> listTvShow;

    public ArrayList<TvShow> getListTvShow() {
        return listTvShow;
    }

    public ListTvShowAdapter(Context context) {
        this.context = context;
    }

    public void setListTvShow(ArrayList<TvShow> listTvShow) {
        this.listTvShow = listTvShow;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_tvshow, viewGroup, false);
        return new ListTvShowAdapter.CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, final int position) {
        holder.tvTitleTV.setText(getListTvShow().get(position).getTitle());
        holder.tvDescTV.setText(getListTvShow().get(position).getDescription());
        Glide.with(context)
                .load(getListTvShow().get(position).getPoster())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imageTV);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Ini item favorite ku " + getListTvShow().get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListTvShow().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitleTV, tvDescTV;
        ImageView imageTV;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitleTV = itemView.findViewById(R.id.tv_item_title_tvshow);
            tvDescTV = itemView.findViewById(R.id.tv_item_desc_tvshow);
            imageTV = itemView.findViewById(R.id.image_poster_tvshow);
        }
    }
}
