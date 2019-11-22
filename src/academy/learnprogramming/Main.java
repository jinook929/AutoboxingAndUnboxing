package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;

// Create a class for int type
class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {

        // Create arrays for int and String
        String[] strArray = new String[10];
        System.out.println(Arrays.toString(strArray));
        int[] intArray = new int[10];
        System.out.println(Arrays.toString(intArray));

        // Create ArrayList for String(= class)
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");
        strArrayList.add("Tom");
        strArrayList.add("John");
        System.out.println(strArrayList.toString());
//        for(int i = 0; i < strArrayList.size(); i++) {
//            System.out.println(strArrayList.get(i));
//        }

        // Create ArrayList for int(=primitive type) => autoboxing/unboxing
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));
        intClassArrayList.add(new IntClass(55));
        intClassArrayList.add(new IntClass(56));
//        System.out.println(intClassArrayList.toString());
        for(int i = 0; i < intClassArrayList.size(); i++) {
            System.out.println(intClassArrayList.get(i).getMyValue());
        }

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        System.out.println(intArrayList.toString());
        for(int i = 0; i < intArrayList.size(); i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer integer = new Integer(77);
        System.out.println(integer);
        Integer integer1 = 78;
        System.out.println(integer1);
        Integer integer2 = Integer.valueOf(79);
        System.out.println(integer2);

        int myInt = integer1.intValue();
        System.out.println(myInt);
        myInt = integer2;
        System.out.println(myInt);

        // Create ArrayList for double(=primitive type) => autoboxing
        Double doubleValue = new Double(11.11);
        System.out.println(doubleValue);
        Double doubleValue1 = 22.22;
        System.out.println(doubleValue1);

        ArrayList<Double> myDoubleValues= new ArrayList<>();
        for(double dbl = 0.0; dbl <= 5.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }
        System.out.println(myDoubleValues.toString());
    }
}
