package me.elordenador.chatmon;

import java.util.ArrayList;
import java.util.List;

public class Utilities {
    public boolean StringPresent(List<String> list, String item) {
        for (int i = 0; i < list.size(); i++) {
            String ite = list.get(i);
            if (item.contains(ite)) {
                return true;
            }
        }
        return false;
    }
}
