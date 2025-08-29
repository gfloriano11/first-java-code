import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // it's like in CS, where you need to declare the type in array and the var name,
        // after that, you need to do the var receive the array with the size
        int[] int_array_test = new int[4];
        char[] array_test = new char[5];

        for(int i = 0; i < int_array_test.length; i++){
            int i_somado = i+1;
            System.out.println("Digite o valor do " + i_somado + "º numero:");
            int_array_test[i] = scanner.nextInt();
        }

        for(int i = 0; i <= int_array_test.length; i++){
            int i_somado = i+1;
            System.out.println("Numero " + i_somado + ": " + int_array_test[i]);
        }

        // but, when we dont know the max size of the array?
        // like in CS too, we can use the ArrayList:

        ArrayList<String> my_list = new ArrayList<>();
        // in c++, whe use my_list.push_back(), but in Java, we use:

        my_list.add("Gustavo");
        my_list.add("Johann");
        my_list.add("Gaucho");
        my_list.add("VH");

        System.out.println(my_list.get(1)); // print 'Johann'
        // in Java whe use get method and array index to access the value
        // PS: Only when we are using ArrayList!!!

    }
}