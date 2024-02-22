package main.com.adventure.settings;
import java.util.HashMap;
import java.util.Map;

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
    public static final Map<String, CommandVerb> verbMap = new HashMap<>();
    static {
        verbMap.put("TAKE", TAKE);
        verbMap.put("MOVE", MOVE);
        verbMap.put("USE", USE);
        verbMap.put("DIG", DIG);
        verbMap.put("EXAMINE", EXAMINE);
        verbMap.put("LOOK", LOOK);
        verbMap.put("HELP", HELP);
        verbMap.put("FIGHT", FIGHT);
        verbMap.put("INVENTORY", INVENTORY);
    }

    /**
     *
     * @param verbString the case to check
     * @return verMap
     */
    public static CommandVerb getVerb(String verbString) {
        return verbMap.getOrDefault(verbString.toUpperCase(), INVALID);
    }
}

