package AllExamples;

import java.util.ArrayList;

public class Ex2_Main {
    public static void run(){
        ArrayList<Ex2_Actor> allActors = new ArrayList<>();

        allActors.add(new Ex2_Actor("Othello", "Ms.SM", true));
        allActors.add(new Ex2_Actor("Iago", "Mrs.B"));
        allActors.add(new Ex2_Actor("Cassio", "Ms.SC"));
        allActors.add(new Ex2_Actor("Desdemona", "Mr.H", true));
        allActors.add(new Ex2_Actor("Roderigo", "Ms.Lei"));

        allActors.get(1).sellTicks(125);
        allActors.get(4).sellTicks(76);

        String seller = "Ms.SM";
        int sold = 50;
        int foundIndex = searchByName(allActors, seller);
        allActors.get(foundIndex).sellTicks(sold);



        for (int i = 0; i < allActors.size(); i++) {
            //System.out.println(allActors.get(i)); // uses toString
//            System.out.println(allActors.get(i).role + " is played by "+allActors.get(i).name);
            allActors.get(i).printMe();
        }

        int totalTix = 0;
        for (int i = 0; i < allActors.size(); i++) {
            totalTix += allActors.get(i).sales;
        }
        System.out.println("We sold "+totalTix +" tickets for revenue of $"+(20*totalTix));


    }

    public static int searchByName(ArrayList<Ex2_Actor> list, String searchTerm){
        for (int i = 0; i < list.size(); i++) {
            if(searchTerm.equalsIgnoreCase(list.get(i).name)){
                return i;
            }
        }
        return -1;
    }


}
