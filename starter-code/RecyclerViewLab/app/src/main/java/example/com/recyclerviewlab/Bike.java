package example.com.recyclerviewlab;

/**
 * Created by erickivet on 7/5/16.
 */
public class Bike {

    //declare variables
    String mBikeName;
    String mBikeDescription;
    String mColor;
    boolean mCheck;

    //constructor
    public Bike(String bikeName, String bikeDescription, String color, boolean check){
        mBikeName = bikeName;
        mBikeDescription = bikeDescription;
        mColor = color;
        mCheck = check;
    }

    //default constructor
    public Bike(){
        mBikeName = "default bike";
        mBikeDescription = "default description";
        mColor = "#000000";
        mCheck = false;

    }

    //getters and setters

    public  String getName(){
        return mBikeName;
    }

    public void setName(String bikeName){
        mBikeName = bikeName;
    }

    public String getDescription(){
        return mBikeDescription;
    }

    public void setDescription(String bikeDescription){
        mBikeDescription = bikeDescription;
    }

    public String getColor(){
        return mColor;
    }

    public void setColor(String color){
        mColor = color;
    }

    public boolean getCheck(){
        return mCheck;
    }

    public void setCheck(boolean check){
        mCheck = check;
    }
}
