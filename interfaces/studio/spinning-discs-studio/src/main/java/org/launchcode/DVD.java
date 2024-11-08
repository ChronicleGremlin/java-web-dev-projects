package org.launchcode;

public class DVD extends BaseDisk {
    // TODO: Implement your custom interface.

    public DVD(float storageCapacity, int numberOfTracks, String rpm) {
        super(storageCapacity, numberOfTracks, rpm);
    }

    @Override
    public void readDisk() {

    }

    @Override
    public void writeDisk() {

    }

    @Override
    public void playTrack() {

    }

    @Override
    public void spinDisk() {
        System.out.println("DVD spins at " + this.getRpm() + " rpm.");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
