package com.example.android.quakereport;

import java.util.List;

/*
 * @param magnitude is the magnitude (size) of the earthquake
 * @param location is the city location of the earthquake
 * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
 *  earthquake happened

 */
public class Earthquake {
    private String mLocation;
    // private String mDate;
    private long mTimeInMilliseconds;
    private double mMagnitude;
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMillisseconds, String url) {
        mLocation = location;
        mTimeInMilliseconds = timeInMillisseconds;
        mMagnitude = magnitude;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    //  public String getDate(){
    //     return mDate;
    //}
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;

    }

    public void addAll(List<Earthquake> data) {
    }

    public void clear() {
    }


}