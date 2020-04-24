import java.util.Scanner;

public class Warrior extends Character {

    public Warrior(String name, int str, int def, int hp){
        super(name, str, def, hp);
        this.strength = str + 5;
        this.defense = def - 3;
        this.health = 100;
    }

    /********************************************/
    //Our greatsword attack looks alot like our Character's basic attack. Instead, it does more damage!
    // Instead of "damage" in the print statement, we have damage dealt because we want the after-defense number
    public void greatSword(Character target){
        int damage = this.strength * 3;
        int damageDealt = target.takeDamage(damage);
        System.out.println(this.name + " attacked " + target.name + " for " + damageDealt + " damage!");
    }
    /********************************************/


    /********************************************/
    //Our block needs to negate our enemies next attack all together, so it is a little tricky to get done,
    // so we need to be pretty smart about how we handle it
    // TODO - Block option
    public void block(Character target){
        System.out.println(this.name + " raises their shield!");
        this.blocking = true;
    }
    /********************************************/


    public int choice(Character target){
        Scanner playerInput = new Scanner(System.in);
        int choice = 0;
        try {
            System.out.println(this.name + " can:");
            System.out.println("1 - Attack w/ Greatsword");
            System.out.println("2 - Block");
            choice = playerInput.nextInt();
        }
        catch(Exception e){
            System.out.println("You picked something other than 1 - 2, you did a basic attack");
        }

        if(this.blocking == true){   //If we were blocking last round, we want to stop blocking now!
            this.blocking = false;
        }

        if(choice == 1){
            if(target.blocking == false)     //We have to check if the target is blocking for every attack!
                this.greatSword(target);    //<---- Also, we don't have to put curly braces after an if statement,
                                            // As long as it's only one line!!
            else
                System.out.println(target.name + " blocked the attack!");
        }

         // If we wanted to add a new choice, we would have to add it around here, where we'd have another
         // "else if (choice == X)" line. We need to check for anything that could block attacks, or anything
         // else that would stop an attack. (Maybe a magic shield for our wizard??) After, we'd call
         // the function that we made in our class, just like this.greatsword()  !

        else if (choice == 2){          //We don't have to check if the opponent is blocking, because we aren't attacking!
            this.block(target);
        }
        else {
            if(target.blocking == false)     //We have to check if the target is blocking for every attack possible!
                this.attack(target);
            else
                System.out.println(target.name + " blocked the attack!");

        }
        return -1;
    }

}
