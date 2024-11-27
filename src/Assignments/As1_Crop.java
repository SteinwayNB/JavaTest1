package Assignments;

public class As1_Crop {
    private String name;
    private double yield;
    private String units;
    private double price;
    private double acres;

    public As1_Crop(String n, double y, String u, double p){
        name = n;
        yield = y;
        units = u;
        price = p;
        acres = 0;
    }

    public void setAcres(double acres) {
        this.acres = acres;
    }

    public String toString(){
        return name+" "+yield+" "+units+" "+price+" "+acres;
    }

    public void printMe(){
        System.out.println("Crop Name: "+name+"; Crop Yield: "+yield+" "+units+"; Crop Price: "+price+"; Crop Total Acres: "+acres);
    }

    public String getName() {
        return name;
    }

    public double getYield() {
        return yield;
    }

    public String getUnits() {
        return units;
    }

    public double getPrice() {
        return price;
    }

    public double getAcres() {
        return acres;
    }
}
