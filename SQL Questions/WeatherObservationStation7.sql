-- Weather Observation Station 7 -- Query the list of CITY names ending with vowels (a, e, i, o, u) 
select 
    DISTINCT city 
from station 
having substring(city,-1, 1) in ('a','e','i','o','u')

-- You can use the substring method with negative sign to work backwords from the string 
