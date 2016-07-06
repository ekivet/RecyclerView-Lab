package example.com.recyclerviewlab;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by erickivet on 7/5/16.
 */
public class CarViewHolder extends RecyclerView.ViewHolder {
    ImageView mImageView;
    TextView mCarTextView;
    TextView mDescCarTextView;




    public CarViewHolder(View itemView){
        super(itemView);

        mImageView = (ImageView) itemView.findViewById(R.id.color_box_car);
        mCarTextView = (TextView) itemView.findViewById(R.id.main_text_car);
        mDescCarTextView = (TextView) itemView.findViewById(R.id.desc_text_car);


    }
}
