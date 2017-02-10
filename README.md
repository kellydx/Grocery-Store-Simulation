# Grocery Store Simulation Overview
Customers in a grocery store arrive at a single register to check out. The register is run by a cashier who serves customers on a first-come, first-served basis. However, there are customers with memberships who show up late but have higher priority. The goal of the problem is to determine when a customer is done checking out and who will be the next one to be serviced.
#Problem Details
Customers with a priority value higher than other existing customers should be placed in front of them. The only exception to this is for the customer in the front of the line (the one currently being serviced).  If a new customer is added to the line with a higher priority than the front customer, the new customer should not be put in front of the customer being serviced – only those that are also waiting in line.
# Driver 
The program (driver) simulate 60 minutes of activity at the store. Each iteration of your program should represent one minute.  At each iteration (minute), your program should do the following:
Check to see if new customers are added to the queue.  There is a 25% chance that new customers show up (need to be added to the queue) every minute. 
Update the customer object currently being serviced (if one exists).  This will be the customer object at the front of the queue.  If the customer has been completely serviced, remove them from the queue.
# Output Format
During execution, The program should output the following information:
•	When a new customer is added to the queue, output, “New customer added!  Queue length is now X” where X is the size of the queue after the new customer has been added.
•	When a customer has been completely serviced, output, “Customer serviced and removed from the queue.  Quest length is now X” where X is the size of the queue after the customer has been removed.
•	At the end of each iteration (minute), output, “---------------------------------------------------“  to visually identify the passing of time.
When your simulation ends, your program should also output the following information:
•	Total number of customers serviced
•	Maximum line length during the simulation 
