import java.util.Scanner;

public class Arena {
    public static void main (String[] args){

        Scanner playerInput = new Scanner(System.in);

        System.out.println("What is your character's name?");
        String name;
        name = playerInput.nextLine();

        System.out.println("What class do you want?");
        System.out.println("1 - Warrior");
        System.out.println("2 - Rogue");
        System.out.println("3 - Wizard");   //Add another print statement like "4 - Knight" to give them another choice
        int choice = 0;
        try {
            choice = playerInput.nextInt();
        }
        catch(Exception e){
            System.out.println("You picked something other than 1 - 3! You're done kiddo.");
            System.exit(0);
        }
        Character player1 = null;
        if(choice == 1){
            player1 = new Warrior(name, 10, 5, 50);
        }
        else if(choice == 2){
            player1 = new Rogue(name, 10, 5, 50);
        }
        else if(choice == 3){
            player1 = new Wizard(name, 10, 5, 50);
        }                                                     //Add another else if for (choice == 4) or (choice == 5)
        else {
            System.out.println("You picked something other than 1 - 3! You're done kiddo.");
            System.exit(0);
        }

        //TODO - Create a function that chooses a class for our enemy!
        // (if we do that, we can't use choice() anymore, we'll have to have a function that chooses an action for the AI!)
        Character player2 = new Character("Jameson", 5, 10, 50);

        System.out.println("-------------- Beginning Stats --------------");
        System.out.println(player1.name + " " + player1.health + " " + player1.strength + " " + player1.defense);
        System.out.println(player2.name + " " + player2.health + " " + player2.strength + " " + player2.defense);

        System.out.println("-------------- Beginning Game! -------------");

        while(player1.isAlive() && player2.isAlive()){
            System.out.println(player1.name + "'s Health: " + player1.health);
            System.out.println(player2.name + "'s Health: " + player2.health);

            int damage;

            System.out.println("-------------- "+ player1.name +"'s turn! -------------");
            damage = player1.choice(player2);

            System.out.println("-------------- "+ player2.name +"'s turn! -------------");

            //TODO - Maybe come up with a function for the AI to randomly use an action?
            damage = player2.choice(player1);
        }

        if(player1.isAlive()){
            System.out.println(player1.name + " won the arena!");
        }
        else if(player2.isAlive()){
            System.out.println(player2.name + " won the arena!");
        }
        else {
            System.out.println("Its a draw!");
        }

    }
}
