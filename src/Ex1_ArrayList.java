import java.util.ArrayList;
import java.util.List;

public class Ex1_ArrayList {
    public static void run(){
        ArrayList <String> allNames = new ArrayList();
//        List <String> allNames2 = new ArrayList();
        ArrayList <Double> allDollars = new ArrayList<>();
        ArrayList <Integer> allNums = new ArrayList<>();
        ArrayList <Boolean> isOscar = new ArrayList<>();

        allNames.add("Samuel"); allDollars.add(14.6); isOscar.add(false);
        allNames.add("Robert");allDollars.add(24.1); isOscar.add(true);
        allNames.add("Zoe");allDollars.add(13.3); isOscar.add(false);
        allNames.add("Tom Cruise");allDollars.add(15.6); isOscar.add(false);

//        System.out.println(allNames);

        allNames.add(1, "Jack"); allDollars.add(1, 14.53); isOscar.add(1, true);

        allDollars.set(2, 18.0);
        allDollars.set(4, allDollars.get(4)+10.0);

        allNames.remove(4);
        allDollars.remove(4);
        isOscar.remove(4);

        for (int i = 0; i < allNames.size(); i++) {
            System.out.println( allNames.get(i) + " has earned $"+allDollars.get(i));

        }


    }



}
