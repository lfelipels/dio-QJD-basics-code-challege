import java.util.Scanner;

public class RobotChallenge {

    public static void run(){

        Scanner movementReader = new Scanner(System.in);
        Integer axisX = 0;
        Integer axisY = 0;
        String moviment = movementReader.next().toUpperCase();


        for (int i = 0; i < moviment.length(); i++){
            Character currentMovement = moviment.charAt(i);
            switch (currentMovement){
                case 'W':
                    axisY += 1;
                    break;
                case 'S':
                    axisY -= 1;
                    break;
                case 'D':
                    axisX += 1;
                    break;

                case 'A':
                    axisX -= 1;
                    break;
            }
        }

        if(axisX == 0 && axisY == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
