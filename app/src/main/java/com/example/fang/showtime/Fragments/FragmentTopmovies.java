package com.example.fang.showtime.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fang.showtime.Movies;
import com.example.fang.showtime.R;
import com.example.fang.showtime.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentTopmovies extends Fragment {
    View v;
    private RecyclerView myrecyclerview2;
    private List<Movies> firstMovie2;

    public FragmentTopmovies() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.topmovies_fragment,container,false);
        myrecyclerview2 = (RecyclerView) v.findViewById(R.id.recyclerView2);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),firstMovie2);
        myrecyclerview2.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview2.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firstMovie2 = new ArrayList<>();

        firstMovie2.add(new Movies(
                "Incredibles 2",
                "2018",
                "PG",
                "Animation,Family",
                "Excellent 8.2/10",
                R.drawable.incredibles2));

        firstMovie2.add(new Movies(
                "Avengers:Infinity War",
                "2018",
                "PG13",
                "Action,Fantasy",
                "Excellent 8.7/10",
                R.drawable.infinitywar));

        firstMovie2.add(new Movies(
                "Rampage",
                "2018",
                "PG13",
                "Action,Science Fiction",
                "Good 6.3/10",
                R.drawable.rampage));

        firstMovie2.add(new Movies(
                "Ready Player One",
                "2018",
                "PG13",
                "Action,Fantasy",
                "Good 7.7/10",
                R.drawable.readyplayer1));

        firstMovie2.add(new Movies(
                "Thor Ragnorok",
                "2018",
                "PG13",
                "ActionComedy",
                "Good 7.9/10",
                R.drawable.thor_ragnorok));


    }
}