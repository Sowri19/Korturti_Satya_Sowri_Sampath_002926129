package Model;


import java.awt.Image;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dpsmv
 */
public class CarProduct {
    private String Brand;
    private String Model;
    private String Color;
    private int Year;
    private int EngineNo;
    private int SeatsNo;
    private int LicensePlates;
    private String OwnerName;
    private int OwnerTelephoneNo;
    private String OwnerEmailAddress;
    private String OwnerDriverLicense;
    private int OwnerSSN;
    private String Owneraddress;
    private String ServiceRecord;
    private int WarrantyYear;
    //private byte[] Photo;
    private Image image;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getEngineNumber() {
        return EngineNo;
    }

    public void setEngineNumber(int EngineNo) {
        this.EngineNo = EngineNo;
    }

    public int getSeatsNumber() {
        return SeatsNo;
    }

    public void setSeatsNumber(int SeatsNo) {
        this.SeatsNo = SeatsNo;
    }

    public int getLicensePlates() {
        return LicensePlates;
    }

    public void setLicensePlates(int LicensePlates) {
        this.LicensePlates = LicensePlates;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public int getOwnerTelephoneNumbers() {
        return OwnerTelephoneNo;
    }

    public void setOwnerTelephoneNumbers(int OwnerTelephoneNo) {
        this.OwnerTelephoneNo = OwnerTelephoneNo;
    }

    public String getOwnerEmailAddress() {
        return OwnerEmailAddress;
    }

    public void setOwnerEmailAddress(String OwnerEmailAddress) {
        this.OwnerEmailAddress = OwnerEmailAddress;
    }

    public String getOwnerDriverLicense() {
        return OwnerDriverLicense;
    }

    public void setOwnerDriverLicense(String OwnerDriverLicense) {
        this.OwnerDriverLicense = OwnerDriverLicense;
    }

    public int getOwnerSSN() {
        return OwnerSSN;
    }

    public void setOwnerSSN(int OwnerSSN) {
        this.OwnerSSN = OwnerSSN;
    }

    public String getOwneraddress() {
        return Owneraddress;
    }

    public void setOwneraddress(String Owneraddress) {
        this.Owneraddress = Owneraddress;
    }

    public String getServiceRecords() {
        return ServiceRecord;
    }

    public void setServiceRecords(String ServiceRecord) {
        this.ServiceRecord = ServiceRecord;
    }

    public int getWarrantyYear() {
        return WarrantyYear;
    }

    public void setWarrantyYear(int WarrantyYear) {
        this.WarrantyYear = WarrantyYear;
    }

   

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    
}
