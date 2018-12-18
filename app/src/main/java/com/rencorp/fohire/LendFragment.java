package com.rencorp.fohire;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LendFragment extends Fragment {
    RecyclerView recyclerView;
    String[] title = {"Again, create an account if you haven't already.", "Upload your product specifications on the website.", "Decide upon a deposit amount and a rental fee for corresponding to your product.", "Connect with our borrowers based on their ratings as we notify you when someone finds your product interesting.", "Treat yourself from the money you make! "};
    String[] text = {"", "A detailed, transparent description is guaranteed to fetch you more and more borrowers..", "", "", ""};

    public LendFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lend, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.listLend);

        FAQAdapter contactAdapter = new FAQAdapter(recyclerView, title, text);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        contactAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(contactAdapter);

        return v;
    }
}
