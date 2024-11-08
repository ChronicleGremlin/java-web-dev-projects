package org.launchcode;

public abstract class BaseDisk implements OpticalReadable {
    private double storageCapacity;
    private int numOfTracks;
    private String rpm;

    public BaseDisk(double storageCapacity, int numOfTracks, String rpm) {
        this.storageCapacity = storageCapacity;
        this.numOfTracks = numOfTracks;
        this.rpm = rpm;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getNumOfTracks() {
        return numOfTracks;
    }

    public void setNumOfTracks(int numOfTracks) {
        this.numOfTracks = numOfTracks;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }
}
