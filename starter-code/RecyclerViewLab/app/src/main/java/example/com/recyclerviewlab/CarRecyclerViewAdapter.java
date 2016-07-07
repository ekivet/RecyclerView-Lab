package example.com.recyclerviewlab;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.Toast;

import java.util.List;

/**
 * Created by erickivet on 7/6/16.
 */

public class CarRecyclerViewAdapter extends RecyclerView.Adapter<CarViewHolder> {

    List<Car> mCarList;

    public CarRecyclerViewAdapter(final List<Car> carList){
        mCarList = carList;
    }

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View parentView = LayoutInflater.from(parent.getContext()).inflate
                (R.layout.car_view, parent, false);
        CarViewHolder carViewHolder = new CarViewHolder(parentView);
        return carViewHolder;
    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, final int position){
        Car car = mCarList.get(position);
        holder.mCarTextView.setText(car.getName());
        holder.mDescCarTextView.setText(car.getDescription());
        holder.mImageView.setBackgroundColor(Color.parseColor(car.getColor()));
       // holder.setOnClickListener(new View.OnClickListener(){
       //     public void onClick(View view){
       //         Toast.makeText(view.getContext(),mCarList.get(position).getName(),
       //                 Toast.LENGTH_SHORT).show();
       //     }

        }


    @Override
    public int getItemCount(){
        return 0;
    }



}
