package Game;

public class WarriorFactory implements AbFactory {
    
    public Character c(){
        // we are instantiating the classes from this places which is hiding from the client
        return new Warrior();
    }

    public Weapon w(){
        return new Sword();
        
    }
}
