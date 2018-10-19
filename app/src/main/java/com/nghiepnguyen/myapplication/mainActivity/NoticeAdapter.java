package com.nghiepnguyen.myapplication.mainActivity;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nghiepnguyen.myapplication.R;
import com.nghiepnguyen.myapplication.model.Recipe;

import java.util.List;

public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.EmployeeViewHolder> {

    private List<Recipe> dataList;
    private RecyclerItemClickListener recyclerItemClickListener;

    public NoticeAdapter(List<Recipe> dataList, RecyclerItemClickListener recyclerItemClickListener) {
        this.dataList = dataList;
        this.recyclerItemClickListener = recyclerItemClickListener;
    }


    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_view_row, parent, false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.txtTitle.setText(dataList.get(position).getTitle());
        holder.txtPublisherBrief.setText(dataList.get(position).getPublisher());
        holder.txtIngredients.setText(dataList.get(position).getIngredientsByString());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerItemClickListener.onItemClick(dataList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitle, txtPublisherBrief, txtIngredients;
        ImageView imageView;

        EmployeeViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_image);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtPublisherBrief = itemView.findViewById(R.id.txt_publisher);
            txtIngredients = itemView.findViewById(R.id.txt_ingredients);

        }
    }
}