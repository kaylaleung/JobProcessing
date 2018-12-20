
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Create 100 jobs, assign random processing times of 0 to 100 time units. 
// Then process the jobs according to the above scheduling methods.
//Use a time slice of 20 units. Compare the average turnaround time for the different strategies
/**
 *
 * @author kayla
 */
public class JobProcessing {
    
    ArrayList<Integer> burstTime = new ArrayList<Integer>(100);
    ArrayList<Integer> FIFOwaitTime = new ArrayList<Integer>(100);
    ArrayList<Integer> SJFwaitTime = new ArrayList<Integer>(100);
    ArrayList<Integer> RRwaitTime = new ArrayList<Integer>(100);
    //ArrayList<Integer> burstTime = new ArrayList<Integer>(4);
    //ArrayList<Integer> waitTime = new ArrayList<Integer>(4);

    public JobProcessing()
    {
        for(int i = 0; i < 100; i++)
        {
            burstTime.add((int) (Math.random()*100) + 1);
        }
        
    }
    
    public ArrayList<Integer> FIFO()
    {
        FIFOwaitTime.add(0);
        
        for(int j = 1; j < 100; j++)
        { 
                int input = FIFOwaitTime.get(j-1) + burstTime.get(j-1);
                FIFOwaitTime.add(input);
        }
        
        return FIFOwaitTime;
    }
    
    public ArrayList<Integer> SJF()
    {
        
        SJFwaitTime.add(0);
        ArrayList<Integer> temp = new ArrayList<Integer>(100);
        for(int i = 0; i < 100; i++)
        {
            temp.add(burstTime.get(i));
        }
        Collections.sort(temp);
        
        for(int j = 1; j < 100; j++)
        { 
                int input = SJFwaitTime.get(j-1) + temp.get(j-1);
                SJFwaitTime.add(input);
        }
        
        Collections.sort(temp);
        return SJFwaitTime;
        
    }
    
    public ArrayList<Integer> RR()
    {
        RRwaitTime.add(0);
        ArrayList<Integer> temp = new ArrayList<Integer>(100);
        for(int i = 0; i < 100; i++)
        {
            temp.add(burstTime.get(i));
        }
        
        int k = 0;
        while(k < 100)
        {
            if(temp.get(0) >= 5)
            {
                temp.add(temp.remove(0));  
            }
            else
            {
                int input = RRwaitTime.get(k) + temp.get(k);
                RRwaitTime.add(input);
                k++;
            }
        }
        return RRwaitTime;
        
    }
    
    public void print(ArrayList<Integer> waitTime)
    {
        
        ArrayList a = burstTime;
        
        for(int i = 0; i < a.size(); i++)
        {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        
        ArrayList b = waitTime;
        for(int j = 0; j < b.size(); j++)
        {
            System.out.print(b.get(j) + " ");
        }
        System.out.println();
    }
    public void average(ArrayList<Integer> waitTime)
    {
        double sum = 0;
        
        for(int j = 0; j < 100; j++)
        { 
            sum = sum + waitTime.get(j);
        }
        System.out.println(sum/100);
    }
    
    
    
    
}


