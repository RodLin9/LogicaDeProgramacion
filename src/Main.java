import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] arg) {
        System.out.println("Hola java!");

        String myString = "Esto es una variable";
        myString = "Aquí cambio el valor de mi cadena de texto";

        System.out.println(myString);

        int myInt = 7;
        Integer dos = 2;

        myInt = myInt + 4;

        System.out.println(myInt);

        Double doueble = 5d;
        System.out.println(doueble);

        Float flaro = 5f;
        System.out.println(flaro);

        System.out.println(flaro+doueble);

        List <String> myList = new ArrayList();
        myList.add("UnString");
        //myList.add(myInt);

        System.out.println(myList);

        Map <String, String> myMap = new HashMap<>();
        myMap.put("String", myString);
        myMap.put("int", "Un STRING x");
        System.out.println(myMap);
        System.out.println(myMap.get("int"));

        for (int i = 0; i < myList.size(); i++) {
            myList.get(i);
            System.out.println(myList.get(i));
        }

        Main myMain = new Main();
        myMain.myFunction(2,2);
    }


    public void myFunction(int myFirst, int mySecond) {

        System.out.println(myFirst + mySecond);

    }
}
