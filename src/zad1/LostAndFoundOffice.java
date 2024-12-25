package zad1;

import java.util.ArrayList;

public class LostAndFoundOffice {
    // создайте список things
    private ArrayList<Object> things = new ArrayList<>();

    // реализуйте метод put()
    public void put(Object element) {
        if (element != null) {
            things.add(element);
        }
    }

    // реализуйте метод check()
    public boolean check(Object target) {
        if (target == null) {
            return false;
        }
        for (Object object : things) { // логика проверки вещи в списке
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}