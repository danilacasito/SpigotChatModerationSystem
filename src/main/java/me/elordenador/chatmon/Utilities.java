package me.elordenador.chatmon;

import java.util.ArrayList;
import java.util.List;

public class Utilities {
    public boolean StringPresent(List list, String item) {
        for (Object o : list) {
            String ite = (String) o;
            if (item.contains(ite)) {
                return true;
            }
        }
        return false;
    }
}
