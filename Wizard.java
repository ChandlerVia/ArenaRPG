import java.util.Scanner;

public class Wizard extends Character {

    public Wizard(String name, int str, int def, int hp){
        super(name, str, def, hp);
        this.strength = str - 3;    //Wizards have low str & def, but they are smart!
        this.defense = def - 3;
        this.health = 100;
        //TODO - Give the wisdom attribute a value! Maybe 10, 20, 50?!
    }

    /************************************************
     *  Here is where we could give our wizard an attack like "Thunderbolt" or "Fireball".
     *  We'd have to create some functions that used our stats to make an attack. Does
     *  a wizard use strength to cast magic though?
     *      No!!
     *  So, we need to add some more stats! Maybe add Wisdom to our character class? (Perhaps Magic
     *  can't be blocked by shields??)
     *  After we do that, we can use these stats to do a powerful magic attack!
     *
     *  DONT FORGET! We need to give the Wizard a "Choice" function as well, just like the Warrior!
     */

    //TODO - give the Wizard a Fireball attack that uses our new Wisdom stat

    //TODO - fill out the Wizard's "Choice" Function so they can make actions!

    public int choice(Character target){

        this.attack(target);
        return -1;
    }

}
