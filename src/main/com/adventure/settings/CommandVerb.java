package main.com.adventure.settings;

/**
 * Sprint 2 Module 3
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */
public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 2 Module 3
    FIGHT,
    //Used in Sprint 3 Module 1
    INVENTORY;


    /**
     * Takes verbString to determine and return the associated CommandVerb.
     *
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        switch (verbString.toUpperCase()) {
            case "TAKE":
                return TAKE;
            case "MOVE":
                return MOVE;
            case "USE":
                return USE;
            case "DIG":
                return DIG;
            case "EXAMINE":
                return EXAMINE;
            case "LOOK":
                return LOOK;
            case "HELP":
                return HELP;
            case "FIGHT":
                return FIGHT;
            case "INVENTORY":
                return INVENTORY;
            default:
                return INVALID;
        }
    }
}
