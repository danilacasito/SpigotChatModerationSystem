package me.elordenador.chatmon;

public class Utilities {
    public boolean StringPresent(String[] arr, String item) {
        for (String i : arr) {
            if (i.contains(item)) {
                return true;
            }
        }
        return false;
    }
}
