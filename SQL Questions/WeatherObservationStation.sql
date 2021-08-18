-- Weather Observation Station 18 -- Query the Manhattan Distance between points a, b and c, d  and round it to a scale of 4 decimal places
select 
    abs(round((min(lat_n) - max(lat_n)) + (min(long_w)- max(long_w)),4))
from station
