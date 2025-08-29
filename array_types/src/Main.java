import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // it's like in CS, where you need to declare the type in array and the var name,
        // after that, you need to do the var receive the array with the size
        int[] int_array_test = new int[4];

        for(int i = 0; i < int_array_test.length; i++){
            int i_somado = i+1;
            System.out.println("Digite o valor do " + i_somado + "º numero:");
            int_array_test[i] = scanner.nextInt();
        }

        for(int i = 0; i <= int_array_test.length; i++){
            int i_somado = i+1;
            System.out.println("Numero " + i_somado + ": " + int_array_test[i]);
        }
    }
}