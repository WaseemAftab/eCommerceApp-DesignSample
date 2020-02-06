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

public class HorizontalCardAdapter extends RecyclerView.Adapter<HorizontalCardAdapter.CardViewHolder> {

    private Context mContext;
    private List<Brands> mData1;

    public HorizontalCardAdapter(Context mContext, List<Brands> mData1) {
        this.mContext = mContext;
        this.mData1 = mData1;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.horizontal_view_card, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.txt1.setText(mData1.get(position).getTitle());
        holder.txt3.setText(mData1.get(position).getTitle());
        holder.txt4.setText(mData1.get(position).getTitle());

        holder.img1.setImageResource(mData1.get(position).getThumbnail());
    }


    @Override
    public int getItemCount() {

        return mData1.size();


    }

    static class CardViewHolder extends RecyclerView.ViewHolder {

        TextView txt1, txt3, txt4;
        ImageView img1, img2;


        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            txt1 = (TextView) itemView.findViewById(R.id.txt1);
            txt3 = (TextView) itemView.findViewById(R.id.txt3);
            txt4 = (TextView) itemView.findViewById(R.id.txt4);

            img1 = (ImageView) itemView.findViewById(R.id.image_view);
            img2 = (ImageView) itemView.findViewById(R.id.image_view2);
        }
    }
}
