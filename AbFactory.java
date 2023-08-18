package Game;

public interface AbFactory {
    
    // will instantiate in the implemented class.
    Weapon w();
    Character c();
}
