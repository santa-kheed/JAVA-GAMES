public class ShowcurrentTime{
    public static void main(String[] args) {
        final int hour_lost = 3;// this is to add what will be shown by 3 hours since i realised there was an error when showing the time
        //obtain the total milliseconds since jan 1 1970
        long totalMilliseconds = System.currentTimeMillis();

        //obtain total seconds since 1970 jan 1 midnight
        long totalSeconds = totalMilliseconds / 1000;

        //calculate  current seconds 
        long currentSecond = (int)(totalSeconds%60);

        //obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        //calculate the current minutes
        long currentMinute = totalMinutes%60;

        //obtain total hours
        long totalHours = totalMinutes / 60;

        //calculate total minutes
        long currentHour = hour_lost + (totalHours % 24);

        //Display current time
        System.out.println("Current time is "+currentHour+":"+currentMinute+":"+currentSecond+" GMT");

    }
}