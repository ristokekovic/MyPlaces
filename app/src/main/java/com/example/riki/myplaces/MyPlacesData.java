package com.example.riki.myplaces;

import java.util.ArrayList;

/**
 * Created by Riki on 3/23/2017.
 */

public class MyPlacesData {
    private ArrayList<MyPlace> myPlaces;
    private MyPlacesData(){
        myPlaces = new ArrayList<MyPlace>();
    }

    private static class SingletonHolder {
        public static final MyPlacesData instance = new MyPlacesData(); //singleton
    }

    public static MyPlacesData getInstance() {
        return SingletonHolder.instance;
    }

    public ArrayList<MyPlace> getMyPlaces()
    {
        return myPlaces;
    }

    public void addNewPlace(MyPlace place)
    {
        myPlaces.add(place);
    }

    public MyPlace getPlace(int index)
    {
        return myPlaces.get(index);
    }

    public void deletePlace(int index)
    {
        myPlaces.remove(index);
    }
}
