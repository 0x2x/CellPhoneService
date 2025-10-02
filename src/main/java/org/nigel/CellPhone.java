package org.nigel;

public class CellPhone {

    private String PhoneNumber;
    private String Model;
    private String Carrier;
    private String Owner;
    private String SerialNumber;

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
    public String getCarrier() {
        return Carrier;
    }

    public void setCarrier(String carrier) {
        Carrier = carrier;
    }
    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String sn) {
        SerialNumber = sn;
    }

    public CellPhone() {
        this.PhoneNumber = null;
        this.Model = null;
        this.Carrier = null;
        this.Owner = null;
    }

    public void dial(String PhoneNumber) {
        System.out.printf(getOwner() + "'s phone is calling " + PhoneNumber + "\n");

    }
}
