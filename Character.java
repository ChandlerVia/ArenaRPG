public class Character {

    public String name;
    public int health;
    public int strength;
    public int defense;
    public boolean blocking;

    public Character(String name, int str, int def, int hp){
        this.name = name;
        this.strength = str;
        this.defense = def;
        this.health = hp;
        this.blocking = false;
    }

    public int takeDamage(int damage){
        int damageTaken = damage - this.defense;
        this.health -= damageTaken;
        return damageTaken;
    }

    public int attack(Character target){
        if(target.blocking == false) {
            int damage = this.strength * 2;
            int damageDealt = target.takeDamage(damage);
            System.out.println(this.name + " attacked " + target.name + " for " + damageDealt + " damage!");
            return damageDealt;
        }
        else {
            System.out.println(target.name + " blocked the attack! \n"+this.name+" did no damage!");
            return -1;
        }
    }

    /**************************************
     * We have to give characters a choice, just like our other classes, because a basic character should be able to
     * choose an option too, even if they don't have much
     * *****************************************/
    public int choice(Character target) {
        System.out.println("Basic characters can only attack!");
        int damage = this.attack(target);
        return -1;
    }



    public boolean isAlive(){
        return this.health > 0;
    }



}
