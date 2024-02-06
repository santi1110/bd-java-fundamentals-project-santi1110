package main.com.adventure.world.objects.keys;

import main.com.adventure.world.objects.Tangible;

/**
 * A key opens a locked door. More specifically, keys work only on doors that share their level.
 * For example, if a key is level 1, it can only open doors that are also level 1.
 *
 * A key's level cannot change once the object is instantiated. You should create the following constructors that take
 * the following parameters:
 * 1. without any inputs (i.e. default parameters)
 * 2. a level (int)
 * 3. a level (int) and a name (string)
 *
 * The default values for a door are level = 1 and name = "key"
 */

public class Key implements Tangible {
    private int level ;
    private String name ;

    /**
     * Represents a kew with dfeault level and name.
     */
    public Key() {
        this.level = 1;
        this.name = "key";
    }
    /**
     * @param level  Represents a key with level param.
     */
    public Key(int level) {
        this.level = level;
        this.name = "key";
    }

    /**
     *
     * @param level Represents a key with level param.
     * @param name Reoresents a key with name param.
     */
    public Key(int level, String name) {
        this.level = level;
        this.name = name;
    }


    //TODO variable for level and name needed here

    //TODO Add default (i.e. no params) constructor here
    //TODO add constructor that takes a level, and saves it

    //TODO add constructor that takes a level and name, and saves it

    public int getLevel() {
        //TODO Fix this so it references the level property instead of 0
        return level;
    }

    //TODO Fix this so it references the name property instead of "key".
    @Override
    public String getName() {
        return name;
    }





    //******IGNORE THE CODE BELOW******//


    @Override
    public Boolean canTake() {
        return true;
    }

    @Override
    public Boolean canUse(Tangible item) {
        return false;
    }

    @Override
    public void useItem(Tangible initiator) { /* intentionally left blank */ }

    @Override
    public void use() {
        System.out.println(getName() + " doesn't much be itself. Try using it on a door");
    }

    @Override
    public String getDescription() {
        return "A key that opens a door";
    }


}
