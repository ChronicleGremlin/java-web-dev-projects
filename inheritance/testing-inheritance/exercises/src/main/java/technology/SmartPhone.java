package technology;

//^SmartPhone ~ three unit tests
//property
//* overheated Boolean
//method
//* TEMPERATURE
//if !UNPLUG
//        overheated false
//overheated true


public class SmartPhone extends Computer {
    private Boolean overheated = false;


    public SmartPhone(String userName, Boolean overheated) {
        super(userName);
        this.overheated = overheated;
    }
}

