package example.com.recyclerviewlab;

/**
 * Created by erickivet on 7/5/16.
 */
public class Car {

        //declare variables
        String mCarName;
        String mCarDescription;
        String mColor;

        //constructor
        public Car (String carName, String carDescription, String color){
            mCarName = carName;
            mCarDescription = carDescription;
            mColor = color;
        }

        //default constructor
        public Car (){
            mCarName = "default car";
            mCarDescription = "default car description";
            mColor = "#000000";


        }

        //getters and setters

        public String getName(){
            return mCarName;
        }

        public void setName(String carName){
            mCarName = carName;
        }

        public String getDescription(){
            return mCarDescription;
        }

        public void setDescription(String carDescription){
            mCarDescription = carDescription;
        }

        public String getColor(){
            return mColor;
        }

        public void setColor(String color){
            mColor = color;
        }
}
