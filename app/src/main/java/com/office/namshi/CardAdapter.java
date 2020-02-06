package com.office.namshi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardVieHolder> {

    private Context mContext;
    private List<Brands> mData;

    public CardAdapter(Context mContext, List<Brands> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public CardVieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.card_view, parent, false);
        return new CardVieHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardVieHolder holder, int position) {

        holder.txt1.setText(mData.get(position).getTitle());
        holder.txt2.setText(mData.get(position).getTitle());
        holder.txt3.setText(mData.get(position).getTitle());
        holder.txt4.setText(mData.get(position).getTitle());

        holder.img1.setImageResource(mData.get(position).getThumbnail());


    }

    @Override
    public int getItemCount() {

        return mData.size();


    }

    static class CardVieHolder extends RecyclerView.ViewHolder {

        TextView txt1, txt2, txt3, txt4;
        ImageView img1, img2;

        public CardVieHolder(@NonNull View itemView) {
            super(itemView);

            txt1 = (TextView) itemView.findViewById(R.id.txt1);
            txt2 = (TextView) itemView.findViewById(R.id.txt2);
            txt3 = (TextView) itemView.findViewById(R.id.txt3);
            txt4 = (TextView) itemView.findViewById(R.id.txt4);

            img1 = (ImageView) itemView.findViewById(R.id.image_view);
            img2 = (ImageView) itemView.findViewById(R.id.image_view2);
        }
    }
}
