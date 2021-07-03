# Write your MySQL query statement below
# Write an SQL query to report the movies with an odd-numbered ID and a description that is not "boring". Return the result table in descending order by rating.
select
    *
from Cinema
where description != 'boring' and mod(id ,2) = 1
order by rating desc
