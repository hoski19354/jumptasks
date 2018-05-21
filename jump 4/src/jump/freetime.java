/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jump;

//import java.sql.Date;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Alastair
 */
public class freetime {
   
    public static void main(String[] args) {
           ArrayList <Long> freetimeslots = new ArrayList<Long>();
           
          
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm:ss");  
           LocalDateTime now = LocalDateTime.now(); 
           String currentdate = dtf.format(now);           
           
           SimpleDateFormat dateformat = new SimpleDateFormat("dd MM yyyy");  
           
           int durationoftime = 60; //equal to input from GUI
           String freedate = "18 03 2018"; //equal to input from GUI
           
           int durationoftime1 = 80; //equal to input from GUI
           String freedate1 = "17 03 2018"; //equal to input from GUI
           
   try {
    Date date1 = (Date) dateformat.parse(currentdate);
    Date date2 = (Date) dateformat.parse(freedate);
    long diff = date2.getTime() - date1.getTime();
    //System.out.println(TimeUnit.DAYS.convert(diff, TimeUnit.DAYS));
    TimeUnit.DAYS.convert(diff, TimeUnit.HOURS);
    freetimeslots.add(diff);
   }
   catch (Exception e){
       e.printStackTrace();
   }
      try {
    Date date1 = (Date) dateformat.parse(currentdate);
    Date date2 = (Date) dateformat.parse(freedate1);
    long diff = date2.getTime() - date1.getTime();
    //System.out.println(TimeUnit.DAYS.convert(diff, TimeUnit.DAYS));
    TimeUnit.DAYS.convert(diff, TimeUnit.HOURS);
       freetimeslots.add(diff);
   }
   catch (Exception e){
       e.printStackTrace();
   }

   //ascending sort algorithm
   
   long temp;
        if (freetimeslots.size()>1) // check if the number of orders is larger than 1
        {
            for (int x=0; x<freetimeslots.size(); x++) // bubble sort outer loop
            {
            for (int i=0; i < freetimeslots.size() - x - 1; i++)
                    if (freetimeslots.get(i).compareTo(freetimeslots.get(i+1)) > 0)
                    {
                        temp = freetimeslots.get(i);
                        freetimeslots.set(i,freetimeslots.get(i+1) );
                        freetimeslots.set(i+1, temp);
                    }
                }
            }
        System.out.println(freetimeslots);
        
        }
  
           //statment to find the distance between current date and freetime date
           //generate an int value of day till freetime date
           //use the int value to store freetime dates from closest to current date to furthest away from current date
           //allign the indexs of the freetimeslot array and duedates array
           
        }
    

           
        
    

