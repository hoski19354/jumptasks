/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jump;

import java.util.ArrayList;

/**
 *
 * @author Alastair
 */
public class dayorder {
        
    String duedate;
    String taskname;
    String subject;
    String duration;
    String starttime;
;
    
     
    public static void main(String[] args){
  
    ArrayList <Integer> duedates = new ArrayList<Integer>();
    ArrayList <Integer> durations = new ArrayList<Integer>(100);

 
    String duedate = "2018/05/24"; //value from the JDateChooser  
    int duration1 = 60;
    durations.add(duration1);
    String remove = duedate.replace("/","");
    int change = Integer.parseInt(remove);
    duedates.add(change);  
   
    String d = "2018/03/30"; //value from the JDateChooser  
    int duration2 = 50;
    durations.add(duration2);
    String r = d.replace("/","");
    int c = Integer.parseInt(r);
    duedates.add(c);   
    
    String de = "2018/02/28"; //value from the JDateChooser  
    int duration3 = 40;
    durations.add(duration3);
    String re = de.replace("/","");
    int ce = Integer.parseInt(re);
    duedates.add(ce);    
    
    String dex = "2018/01/30"; //value from the JDateChooser  
    int duration4 = 30;
    durations.add(duration4);
    String rex = dex.replace("/","");
    int cex = Integer.parseInt(rex);
    duedates.add(cex);    
    
    System.out.println(duedates);
    
   //ascending sort algorithm
   int temp;
        if (duedates.size()>1) // check if the number of orders is larger than 1
        {
            for (int x=0; x<duedates.size(); x++) // bubble sort outer loop
            {
            for (int i=0; i < duedates.size() - x - 1; i++)
                    if (duedates.get(i).compareTo(duedates.get(i+1)) > 0)
                    {
                        temp = duedates.get(i);
                        duedates.set(i,duedates.get(i+1) );
                        duedates.set(i+1, temp);
                    }
                }
            }
        System.out.println(duedates);
        
        }
    
               
  }
  

 
    


   
