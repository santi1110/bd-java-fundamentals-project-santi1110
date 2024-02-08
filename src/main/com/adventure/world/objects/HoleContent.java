package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
    private Key content;
    private boolean isCovered;

    /**
     *  HoleContent class.
     * @param content of the key.
     */
    public HoleContent(Key content) {
        this.content = content;
        this.isCovered = true;
    }
    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }
    public boolean isCovered() {
        return isCovered;
    }
    public Key getKey() {
        return content;
    }
}
