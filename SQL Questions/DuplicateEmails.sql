# Write your MySQL query statement below
# Write a SQL query to find all duplicate emails in a table named Person.
select 
   Email
from Person 
group by Email 
having count(Email) > 1
