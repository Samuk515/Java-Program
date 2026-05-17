package Day6;

public class DayWeek {
    public static void main(String[] args) {
        int day = 5;
        String dayName, type;
        switch (day){
            case 1: dayName = "Sunday"; break;
            case 2: dayName = "Monday"; break;
            case 3: dayName = "Tuesday"; break;
            case 4: dayName = "Wednesday"; break;
            case 5: dayName = "Thursday"; break;
            case 6: dayName = "Friday"; break;
            case 7: dayName = "Saturday"; break;
            default: dayName = "Invalid Day"; break;
        }
        switch (day){
            case 6:
            case 7:
                type = "Weekend";
                break;
            default:
                type = "Weekday";
        }
        System.out.println("Day :" + dayName + " Type :" + type);
    }

}
