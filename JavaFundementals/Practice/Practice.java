import java.util.Scanner;  // Import the Scanner class

class Practice {
    public static void main(String[] args) {
        Scanner myInfo = new Scanner(System.in);
        System.out.println("Enter your name");
        String myName = myInfo.nextLine();
        System.out.println("Enter your age");
        String myAge = myInfo.nextLine();
        System.out.println("Enter your address");
        String myAddress = myInfo.nextLine();



        System.out.println("Your name is: " + myName);
        System.out.println("You are: " + myAge +" old");
        System.out.println("Your hometown is: " + myAddress);

    }
}
