# Write your MySQL query statement below
select
    e.Name as Employee 
from Employee as e 
join Employee as p 
on   e.ManagerId = p.Id 
where e.Salary > p.Salary 
