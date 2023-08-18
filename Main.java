package Game;


public class Main {
    
    public static void main(String [] args){
        
        AbFactory warrior = new WarriorFactory();
        //instantiating the class here of character. 
        Character warChar = warrior.c();

        //instantiating the class of weapon.
        Weapon warWeapon = warrior.w();
        warChar.character();
        warWeapon.name();

        AbFactory mage = new MageFactory();
        Character mageChar = mage.c();
        Weapon mageWeapon = mage.w();
        mageChar.character();
        mageWeapon.name();


    }
    
}
