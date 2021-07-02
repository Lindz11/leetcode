# Write your MySQL query statement below
# Suppose that a website contains two tables, the Customers table and the Orders table. Write a SQL query to find all customers who never order anything.
select 
    c.Name as Customers 
from Customers as c
left join Orders o 
on c.Id = o.CustomerId
where o.CustomerId IS NULL 
