package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondaryActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<Bike> mBikes;
    LinearLayoutManager mLayoutManager;
    CarRecyclerViewAdapter mViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_secondary);

        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mBikes = new ArrayList<>();

        mBikes.add(new Bike("Honda", "CBR 1000 RR", "#000000", true ));
        mBikes.add(new Bike());

        mViewAdapter = new BikeRecyclerViewAdapter(mBikes);
        mRecyclerView.setAdapter(mViewAdapter);

    }
}
