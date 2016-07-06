package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.content.Intent;


import java.util.List;

/**
 * Created by erickivet on 7/6/16.
 */
public class BikeRecyclerViewAdapter extends RecyclerView.Adapter<BikeViewHolder> {

    List<Bike> mBikeList;

    public BikeRecyclerViewAdapter(List<Bike> bikeList){
        mBikeList = bikeList;

    }

    @Override
    public BikeViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentview = inflater.inflate(R.layout.bike_view,parent,false);
        BikeViewHolder bikeViewHolder = new BikeViewHolder(parentview);
        return bikeViewHolder;
    }

    @Override
    public void onBindViewHolder(final BikeViewHolder holder, final int position){
        intent(holder.mCheck.getContext(),MainActivity.class);
        Bike bike = mBikeList.get(position);
        holder.mBikeTextView.setText(Bike.getName());

    }
}
