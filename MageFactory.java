package Game;

public class MageFactory implements AbFactory {
    
    public Character c(){
        return new Mage();
    }

    public Weapon w(){
        return new Staff();
    }
}
