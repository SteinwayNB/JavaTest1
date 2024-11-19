package AllExamples;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Ex3_Client {
    //instances variables
    private String name;
    private String address;
    private int lawnsize;
    private boolean hasDog;
    private double outstandingFees;

    //constructor method
    public Ex3_Client(String n, String a, int s, boolean d){
        name = n;
        address = a;
        lawnsize = s;
        hasDog = d;
        outstandingFees = 0;
    }


    //instance methods
    public String toString(){
        return name + "  "+address+"  "+ lawnsize+"  "+hasDog+"  "+outstandingFees;
    }

    public void mowLawn(){
        double baseFee = 20;

        if(lawnsize < 300){
            baseFee += 0.1*lawnsize;
        }else{
            baseFee += 0.15*lawnsize;
        }

        if(hasDog){
            baseFee += 40;
        }

        outstandingFees += baseFee;
        System.out.println(name +" your lawn was mowed today for a charge of $"+baseFee);
        System.out.println("You currently owe $"+outstandingFees);
    }

}
