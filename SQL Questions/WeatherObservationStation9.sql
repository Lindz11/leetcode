-- Weather Observation Station 9 -- Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.
select 
    DISTINCT city 
from station
having substring(city, 1, 1) not in ('a','e','i','o','u')
