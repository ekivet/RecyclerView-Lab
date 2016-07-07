package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    //declare objects
    RecyclerView mRecyclerView;
    List<Car> mCars;
    LinearLayoutManager mLayoutManager;
    CarRecyclerViewAdapter mViewAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set recyclerview
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_main);
        //set layout manager
        mLayoutManager = new LinearLayoutManager
                (this, LinearLayoutManager.VERTICAL, false);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mCars = new ArrayList<>();

        mCars.add(new Car("Honda","Civic","#000000"));
        mCars.add(new Car());

        mViewAdapter = new CarRecyclerViewAdapter(mCars);
        mRecyclerView.setAdapter(mViewAdapter);







    }
}
