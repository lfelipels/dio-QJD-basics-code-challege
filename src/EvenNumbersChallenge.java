import java.util.Arrays;
import java.util.Scanner;

/**
 * In this challange i write a code that
 * calculate the quantity of even numbers that exists between 1 and a defined number
 */
public class EvenNumbersChallenge {

    public static void run(){
        Scanner reader = new Scanner(System.in);
        Integer counter = 0;

        Integer number = reader.nextInt();

        for(int i = 1; i <= number; i++){
            String strNumber = String.valueOf(i);
            if(
                    strNumber.length() == 1 &&
                            i % 2 == 0
            ){
                counter++;
                continue;
            }

            Integer sumDigits = Arrays.stream(strNumber.split(""))
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);

            if(sumDigits % 2 == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
