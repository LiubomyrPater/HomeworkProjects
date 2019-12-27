package cinema;

public enum Days {

    SUNDAY("Sunday", "Неділя"),
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота");

    private String english;
    private String ukrainian;

    Days(String english, String ukrainian) {
        this.english = english;
        this.ukrainian = ukrainian;
    }

    public String getDay(boolean language) {
        return language ? english : ukrainian;
    }
}
