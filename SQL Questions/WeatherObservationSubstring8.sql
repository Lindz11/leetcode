-- Weather Observation Station 8 -- Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) your result cannot contain duplicates 
select 
    DISTINCT city
from station 
having substring(city, -1, 1 ) in ('a','e','i','o','u') and  substring(city, 1, 1 ) in ('a','e','i','o','u') 
