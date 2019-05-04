package com.cmjones.subwaytracker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<String> data;
    private LayoutInflater layoutInflater;
    private ItemClickListener itemClickListener;

    MyAdapter(Context context, List<String> setData) {
        layoutInflater = LayoutInflater.from(context);
        data = setData;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.recycler_view_row, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (data.get(position).equals("A")) {
            holder.direction.setText(R.string.downtown);
            holder.destination.setText(R.string.rockaway);
            holder.bullet.setImageResource(R.drawable.a_circle);
            holder.arrivalTime.setText("2");
        } else if (data.get(position).equals("5")) {
            holder.direction.setText(R.string.uptown);
            holder.destination.setText(R.string.inwood);
            holder.bullet.setImageResource(R.drawable.five_circle);
            holder.arrivalTime.setText("3");
        } else if (data.get(position).equals("7")) {
            holder.direction.setText(R.string.queens);
            holder.destination.setText(R.string.flushing);
            holder.bullet.setImageResource(R.drawable.seven_circle);
            holder.arrivalTime.setText("7");
        } else if (data.get(position).equals("N")) {
            holder.direction.setText(R.string.brooklyn);
            holder.destination.setText(R.string.coney);
            holder.bullet.setImageResource(R.drawable.n_circle);
            holder.arrivalTime.setText("12");
        }
    }

    /**
     * Get the total number of train objects.
     *
     * @return the number of trains
     */
    @Override
    public int getItemCount() {
        return data.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView bullet;
        TextView direction;
        TextView destination;
        TextView arrivalTime;

        ViewHolder(View itemView) {
            super(itemView);
            direction = itemView.findViewById(R.id.direction);
            destination = itemView.findViewById(R.id.destination);
            bullet = itemView.findViewById(R.id.bullet);
            arrivalTime = itemView.findViewById(R.id.arrivalTime);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (itemClickListener != null) {
                itemClickListener.onItemClick(view, getAdapterPosition());
            }
        }
    }

    // Convenience method for getting data at click position
    String getItem(int position) {
        return data.get(position);
    }

    // Allows clicks events to be caught
    void setClickListener(ItemClickListener setItemClickListener) {
        itemClickListener = setItemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}