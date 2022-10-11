import java.util.Scanner;

public class ArithmeticChallenge {

    public static void run(){
        Integer steps = 0;
        Scanner reader = new Scanner(System.in);
        Integer number = reader.nextInt();

        while(number > 0){
            if(number % 2 == 0){
                number /= 2;
            }else {
                number--;
            }
            steps++;
        }

        System.out.println(steps);
    }
}
