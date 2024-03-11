package module4;
/**
 * This file illustrates the concept of "static"
 */

public class CalendarEvent {

    enum DAY {MONDAY, WEDNESDAY, FRIDAY, SUNDAY};

    // Static properties are shared among all instances of a class
    // No matter how many objects you create, there is only one copy of a static property
    // Static properties belong to the class itself, not to any specific instance of the class
    static private int currentYear;

    public static void setCurrentYear(int year) {
        currentYear = year;
    }

    public static int getCurrentYear() {
        return currentYear;
    }

}