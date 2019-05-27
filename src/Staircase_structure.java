import java.util.Scanner;

//Drawing a staircase structure - given the required height, output a staircase as shown in the example	

public class Staircase_structure {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");

        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j < n - 1 - i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println(" ");
        }

    }
}
