public class Time{
    //attributes
    private int hour;
    private int minute;
    private int second;
    //constructors
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    //behaviours
    //getters
    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    //setters
    public void setHour(int hour){

        this.hour = hour;

    }

    public void setMinute(int minute){

        this.minute = minute;

    }

    public void setSecond(int second){

        this.second= second;

    }

   

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public Time nextSecond(){
        int totalSeconds = hour * 3600 + minute * 60 + second;
    // Add 1 second
    totalSeconds++;
   
    totalSeconds %= 86400;  //(24 * 3600) seconds in a day

    // Recalculate
    hour   = totalSeconds / 3600;
    minute = (totalSeconds % 3600) / 60;
    second = totalSeconds % 60;

    return this;
}

public Time previousSecond(){
    int totalSeconds = hour * 3600 + minute * 60 + second;
    totalSeconds--;  // Subtract one second
    
    // If we go below 0, it means we passed midnight going backwards
    if (totalSeconds < 0) {
        // Wrap around to the last second of the day
        totalSeconds += 86400;  
    }
    
    // Convert back to hour, minute, second
    hour   = totalSeconds / 3600;
    minute = (totalSeconds % 3600) / 60;
    second = totalSeconds % 60;
    
    return this;  
}


//     public Time nextSecond(){
//         second++;

//         if (second == 60) {
//             second = 0;
//             minute++;
//             if (minute == 60) {
//                 minute = 0;
//                 hour++;
//                 if (hour == 24) {
//                     hour = 0;
//             }
//         }
//     }
//     return this;
// }

// public Time previousSecond(){
//     second--;
//     if (second < 0) {
//         second = 59;
//         minute--;
//         if (minute < 0) {
//             minute = 59;
//             hour--;
//             if (hour < 0) {
//                 hour = 23;
//             }
//         }
//     }
//     return this; 
// }






    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}