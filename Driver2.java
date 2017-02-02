/**
 * @author Xuan Duong
 *
 * This Driver class simulates customers waiting in line at a grocery store in 60 minutes.
 * There is a 25% chance that new customers show up every minute. 
 * Customers with a priority value higher than other existing customers should be placed in front of other customers in line.  
 * This class will add, remove customers from the queue and output the
 * total number of customer serviced and maximum length of the line at the end.
 * 
 */
import java.util.Random; // Used to give a 25% chance of adding a new customer at each iteration.

public class Driver2{

   public static void main(String [] args){
       int addCust = 0; // Holds a value of 1-4, if the value is 1 a new customer is added to the queue.
       int custServed = 0; // Holds the number of customers served 
       int maxLineSize = 0; // Holds the maximum customers in line during simulation
       PriorityQueue2 cqueue = new PriorityQueue2();
       
      // The loop loops 60 times to simulate the 60 minutes in the store.
       for(int i = 0; i <= 59; i++){ 
           Random randNum = new Random();
           addCust = randNum.nextInt(4) + 1; // generates random number to create 25% chance there is a new customer
           // add a new customer to line if variable addCust got a value 1 from range 1-4
           if(addCust == 1)
           { 
               PriorityCustomer c = new PriorityCustomer();
               cqueue.addCustomer(c);
               System.out.println("New customer added! Queue length is now " + cqueue.getSize() );
           }
           
           // update the maximum number of customer in line
           if(maxLineSize == 0)
           { 
               maxLineSize = cqueue.getSize();
           }
           else if(maxLineSize < cqueue.getSize()){                                                    
               maxLineSize = cqueue.getSize();
           }

           PriorityCustomer first = cqueue.getFirst(); // The first customer in the queue is the customer currently being serviced.
           
           // If the queue is empty, a message is displayed to the user.
           if(first == null){ 
               System.out.println("The queue is empty");
           }
           // If the serviceTime of the customer being serviced is greater than 0,
           // Decrese servive time by 1 until it reachs 0
           else if(first.getServiceTime() > 0){ 
               first.decServiceTime();
           }
           else{ // If the serviceTime is 0, the customer has been fully serviced and is removed from queue. The next customer's service time starts getting decremented in the next iteration
                  
               cqueue.removeCustomer();
               System.out.println("Customer serviced and removed from the queue. Queue length is now " + cqueue.getSize() + "."); 
               custServed++; // Number of customers serviced is incremented.
           }
           System.out.println("---------------------------------------------------"); 
       }
      //output total number of customer serviced and maximum customers in line during simulation
       System.out.println("Total number of customers serviced: " + custServed); 
       System.out.println("Maximum line length: " + maxLineSize);
   }
}