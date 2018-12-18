package com.rencorp.fohire;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FAQAdapter extends RecyclerView.Adapter<FAQAdapter.MyViewHolder> {
    RecyclerView recyclerView;
    String[] title;
    String[] text;

    FAQAdapter(RecyclerView recyclerView, String[] title, String[] text) {
        this.recyclerView = recyclerView;
        this.title = title;
        this.text = text;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.faq_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.txttitle.setText(title[i].toString());
        myViewHolder.txtText.setText(text[i].toString());
        myViewHolder.txtNo.setText(String.valueOf(i + 1));
    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txttitle;
        public TextView txtText, txtNo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //find
            txttitle = (TextView) itemView.findViewById(R.id.txttitle);
            txtText = (TextView) itemView.findViewById(R.id.txtText);
            txtNo = (TextView) itemView.findViewById(R.id.txtnum);
        }
    }
}
