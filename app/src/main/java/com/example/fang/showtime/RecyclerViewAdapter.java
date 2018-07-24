package com.example.fang.showtime;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fang.showtime.Mainscreens.MovieInformationActivity;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    public interface OnMovieClickListener{
        void onMovieClick(int id);
    }

    private OnMovieClickListener callback;
    private Context mContext ;
    private List<Movies> mData;


    public RecyclerViewAdapter(Context mContext, List<Movies> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v ;
        v = LayoutInflater.from(mContext).inflate(R.layout.now_showing_list,parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        holder.tv_title.setText(mData.get(position).getTitle());
        holder.tv_year.setText(mData.get(position).getYear());
        holder.tv_prating.setText(mData.get(position).getPrating());
        holder.tv_genre.setText(mData.get(position).getGenre());
        holder.tv_rating.setText(mData.get(position).getRating());
        holder.img.setImageResource(mData.get(position).getPoster());


        holder.item_nowshowing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,MovieInformationActivity.class);
                Toast.makeText(mContext,"Test Click"+String.valueOf(holder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
                callback.onMovieClick(mData.get(position).getPoster());
                mContext.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private ConstraintLayout item_nowshowing;
        private TextView tv_title;
        private TextView tv_year;
        private TextView tv_prating;
        private TextView tv_genre;
        private TextView tv_rating;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

            item_nowshowing = (ConstraintLayout) itemView.findViewById(R.id.nowshowing_layout_id);
            tv_title = (TextView) itemView.findViewById(R.id.title_movie);
            tv_year = (TextView) itemView.findViewById(R.id.year_movie);
            tv_prating = (TextView) itemView.findViewById(R.id.prating_movie);
            tv_genre = (TextView) itemView.findViewById(R.id.genre_movie);
            tv_rating = (TextView) itemView.findViewById(R.id.rating_movie);
            img = (ImageView) itemView.findViewById(R.id.img_movie);


        }
    }

}