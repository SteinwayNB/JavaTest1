package Assignments;

//import AllExamples.Ex2_Actor;

import java.util.ArrayList;
import java.util.Scanner;

public class As1_Main {
    public static void run(){
        Scanner input = new Scanner(System.in);
        ArrayList<As1_Crop> allCrops = new ArrayList<>();
        allCrops.add(new As1_Crop("corn", 202, "bushels", 437.5));
        allCrops.add(new As1_Crop("wheat", 57.8, "bushels", 567.5));
        allCrops.add(new As1_Crop("apple", 26.5, "tons", 370));
        allCrops.add(new As1_Crop("strawberry", 7300, "pounds", 500));
        allCrops.add(new As1_Crop("Okra", 8000, "pounds", 630));

        for (int i = 0; i < allCrops.size(); i++) {
            System.out.println(allCrops.get(i));
        }

        System.out.println();
        allCrops.get(0).setAcres(100);
        allCrops.get(1).setAcres(200);
        allCrops.get(2).setAcres(300);
        allCrops.get(3).setAcres(50);
        allCrops.get(4).setAcres(350);

        for (int i = 0; i < allCrops.size(); i++) {
            System.out.println(allCrops.get(i));
        }
        System.out.println();

        while(true) {
            System.out.println("Press 1 for farm summary\nPress 2 to for searching and harvesting a crop\nPress 3 for total revenue\nPress 4 to plant a crop\nPress 5 to exit");

            int choice = input.nextInt();
            input.nextLine();


            if (choice == 1) {
                for (int i = 0; i < allCrops.size(); i++) {
                    allCrops.get(i).printMe();
                }
            }
            if (choice == 2) {
                System.out.println("What is the name of the crop");
                String cropName = input.nextLine();
//                if(searchByName(allCrops,cropName) == -1){
//                    System.out.println("Not found");
//                    break;
//                }
//               allCrops.get(searchByName(allCrops,cropName)).printMe();


            }
            if (choice == 3) {
                System.out.println("Cool dadio!");
            }
            if (choice == 4) {

            }
            if(choice == 5){
                break;
            }
            System.out.println();
        }//while

    }
//    public static int searchByName(ArrayList<As1_Crop> list, String searchTerm){
//        for (int i = 0; i < list.size(); i++) {
//            if(searchTerm.equalsIgnoreCase(list.get(i).name)){
//                return i;
//            }
//        }
//        return -1;
//    }

}
