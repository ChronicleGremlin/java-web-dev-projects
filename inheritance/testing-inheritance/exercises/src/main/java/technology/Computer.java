package technology;

//Computer ~ three unit tests each class
//3 properties
//* Username String
//* fully charged Boolean
//* need to charge Boolean
//2 methods
//* UNPLUG fully charged true
//            need to charge false
//* CHARGE
//if !fully charged
//            need to charge true
//fully charged false
// *
//1 constructor
//username = username constructor
public class Computer {
    private String userName;
    private Boolean fullyCharged = false;
    private Boolean needToBeCharged = false;


    public Computer(String userName) {
        this.userName = userName;
    }




    //setters and getters
    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Boolean getFullyCharged() {
        return fullyCharged;
    }


    public void setFullyCharged(Boolean fullyCharged) {
        this.fullyCharged = fullyCharged;
    }


    public Boolean getNeedToBeCharged() {
        return needToBeCharged;
    }


    public void setNeedToBeCharged(Boolean needToBeCharged) {
        this.needToBeCharged = needToBeCharged;
    }


    public void unplug() {
        fullyCharged = true;
        needToBeCharged = false;
    }


    public void charge() {
        if (!fullyCharged) {
            needToBeCharged = true;
        }
        fullyCharged = false;
    }
}

