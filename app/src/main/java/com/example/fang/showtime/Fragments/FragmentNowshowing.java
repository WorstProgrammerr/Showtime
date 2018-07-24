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

public class FragmentNowshowing extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Movies> firstMovie;

    public FragmentNowshowing() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.nowshowing_fragment,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.recyclerView1);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),firstMovie);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firstMovie = new ArrayList<>();
        firstMovie.add(new Movies("M1",
                "Ant Man and the Wasp",
                "2018",
                "PG13",
                "Action,Comedy",
                "Good 7.8/10",
                R.drawable.antman_and_the_wasp));

        firstMovie.add(new Movies("M2",
                "Deadpool 2",
                "2018",
                "R21",
                "Action,Comedy",
                "Excellent 8.1/10",
                R.drawable.deadpool2));

        firstMovie.add(new Movies("M3",
                "Incredibles 2",
                "2018",
                "PG",
                "Animation,Family",
                "Excellent 8.2/10",
                R.drawable.incredibles2));

        firstMovie.add(new Movies("M4",
                "Avengers:Infinity War",
                "2018",
                "PG13",
                "Action,Fantasy",
                "Excellent 8.7/10",
                R.drawable.infinitywar));

        firstMovie.add(new Movies("M5",
                "Jurrasic World",
                "2018",
                "PG13",
                "Action,Adventure",
                "Good 6.6/10",
                R.drawable.jurrasicworld));
        firstMovie.add(new Movies("M6",
                "Rampage",
                "2018",
                "PG13",
                "Action,Science Fiction",
                "Good 6.3/10",
                R.drawable.rampage));

        firstMovie.add(new Movies("M7",
                "Ready Player One",
                "2018",
                "PG13",
                "Action,Fantasy",
                "Good 7.7/10",
                R.drawable.readyplayer1));

        firstMovie.add(new Movies("M8",
                "Thor Ragnorok",
                "2018",
                "PG13",
                "ActionComedy",
                "Good 7.9/10",
                R.drawable.thor_ragnorok));


    }
}
