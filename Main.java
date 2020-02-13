package Cities;



import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean c= true;
        while (c){
            String command = input.nextLine();
            switch (command){
                case"exit":
                    c=false;
                    System.out.println("Bye");
                    break;
                case"start":
                    beginTheGame();
                    break;
                default:
                    System.out.println("Command not found");
            }
        }
    }
    public static void beginTheGame(){
        System.out.println("Welcome to game. Enter the name of city, please: ");
        String city = input.nextLine();
        Game ui= new Game();
        ui.setCity(city);

    }
}
