-- Find the year that Uber acquired more than 2000 customers through advertising using celebrities.
select 
    year
from uber_advertising
where advertising_channel = 'celebrities' and customers_acquired > 2000
