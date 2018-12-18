package com.rencorp.fohire;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BorrowFragment extends Fragment {
    String[] title = {"Create an account on the website.", "Enter the details of the kind of product you're looking for.", "Choose among the available lenders based on the product conditions and the rent fares they offer.", "Connect with your chosen lender and receive the product in exchange for a nominal deposit.", "Rejoice on having saved loads of money you'd have otherwise spent on buying! "};
    String[] text = {"This will help us know you better and shall only take 5 minutes tops. Promise.", "Filter the products according to your needs.", "", "Deposit shall be returned to you as soon as you turn in the product safely.", ""};
    private RecyclerView recyclerView;

    public BorrowFragment() {
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
        View v = inflater.inflate(R.layout.fragment_borrow, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.listBorrow);

        FAQAdapter contactAdapter = new FAQAdapter(recyclerView, title, text);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(contactAdapter);

        return v;
    }

}
