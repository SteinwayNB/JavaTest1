package Assignments;

import AllExamples.Ex3_Client;
import AllExamples.Library;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class As3_LeagueMain {
    public static void run(){
        ArrayList<As3_Team> allTeams = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        loadFile("Data/TeamNames.csv", allTeams);

        while(true) {

            System.out.println("Press 1 to print list of teams\nPress 2 to find averages of number of albums\nPress 3 to filter by history \nPress 4 to sort by conductor\nPress 5 to update stats\nPress 6 to exit and save ");


            int choice = Library.input.nextInt();
            Library.input.nextLine();

            if (choice == 1) {
                for (int i = 0; i < allTeams.size(); i++) {
                    allTeams.get(i).printMe();
                }

            }
            if (choice == 2) {
                int sum0 = 0;
                int sum1 = 0;
                int sum2 = 0;
                for (int i = 0; i < allTeams.size(); i++) {
                    sum0 += allTeams.get(i).getNumAlbums();
                    sum1 += allTeams.get(i).getEarnings();
                    sum2 += allTeams.get(i).getTime();
                }
                System.out.println("Average on number of albums: "+(sum0)/ allTeams.size());
                System.out.println("Average on amount of earnings: $"+(sum1)/allTeams.size()+"K");
                System.out.println("Average on years of history: "+sum2/ allTeams.size()+" years");

            }
            if (choice == 3) {
                System.out.println("Enter the number of years you would like to filter by. (More than how many years)");
                int numYear = Library.input.nextInt();
                Library.input.nextLine();
                for (int i = 0; i < allTeams.size(); i++) {
                    if(allTeams.get(i).getTime() >= numYear){
                        allTeams.get(i).printMe();
                    }
                }

            }
            if (choice == 4) {

            }
            if(choice == 5){

            }
            if(choice == 6){
                saveFile("Data/TeamNames.csv", allTeams);
                break;

            }
            System.out.println();

        }//while



    }
    public static void loadFile(String filename, ArrayList<As3_Team> list ) {

        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));

            String dataToRead;
            while( file.ready()){
                dataToRead = file.readLine();

                String tempArray[] = dataToRead.split(",");
//the next line is customized for whatever class you are creating.
//Here we create a new STUDENT so there are 5 variables
//Unfortunately, you need to Parse any variable that is not a String.  Integers, doubles and booleans are all demonstrated below.
                list.add( new As3_Team(  tempArray[0],tempArray[1], Integer.parseInt(tempArray[2]),Integer.parseInt(tempArray[3]), tempArray[4], Integer.parseInt(tempArray[5])));

            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }//end loadFile

    public static void saveFile(String filename, ArrayList <As3_Team> tempList ) {
        try {
            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < tempList.size(); i++) {
//the next lines are customized for whatever data you are getting.
                String toSave ="";
                toSave = tempList.get(i).getName();  //assumes getter method are used for private variables
                toSave +="," + tempList.get(i).getEarnings();
                toSave += "," + tempList.get(i).getConductor();
                toSave +="," + tempList.get(i).getTime();
                toSave +="," + tempList.get(i).getRegion();
                toSave +="," + tempList.get(i).getNumAlbums();

//The above 6 lines could be replaced by a call to a carefully made toString() function

                file.println(toSave);

            }
            file.close();
        }
        catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }//end saveFile
}
