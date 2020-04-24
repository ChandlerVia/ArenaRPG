import java.util.Scanner;

public class Rogue extends Character {

    public Rogue(String name, int str, int def, int hp){
        super(name, str, def, hp);
        this.strength = str + 5;
        this.defense = def - 3;
        this.health = 100;
    }
    /************************************************
     *  Here is where we could give our rogue an attack like "sneak attack" or "dodge".
     *  We'd have to create some functions that used our stats to make an attack. Does
     *  a rogue use strength to attack though?
     *      Maybe! But they aren't as strong as the warrior though...
     *  So maybe we do less damage, but it ignores armor! or it can go twice in a row!
     *
     *  DONT FORGET! We need to give the rogue a "Choice" function as well, just like the Warrior!
     */

    //TODO - give the rogue a sneak attack option

    //TODO - fill out the rogue's "Choice" Function so they can make actions!


    public int choice(Character target){

        this.attack(target);
        return -1;
    }

}

