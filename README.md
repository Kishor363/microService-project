This is a microservice for a banking application. To support banking process you will have to create a solution using Microservices architecture. Details of these microservices are mentioned below :
1.	Customer Management Service with below mentioned APIs:
a.	Add customer
b.	Get all Customers
c.	Get singleCustomer Details
d.	Update Customer Details
e.	Delete Customer (Deleting customer should also delete the customer account from account management service)


3.	Account Management service with below mentioned APIs:
a.	Add Money to account. (Before adding money to account must check if customer details passed in the request are valid or not)
b.	Withdraw money from account. (Before adding money to account must check if customer details passed in the request are valid or not)
c.	Get Account details. (Details include account details and related customer details).
d.	Delete Account.
