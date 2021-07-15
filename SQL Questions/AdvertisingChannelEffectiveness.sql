with cal_years as (select
advertising_channel,
year,
1.0*money_spent/customers_acquired as avg_effectiveness
from uber_advertising
where year between 2017 and 2019
) 
select 
advertising_channel,
avg(avg_effectiveness) as ans
from cal_years
group by advertising_channel 
order by ans

-- hows do we calculate effectiveness?
-- we can use between to select the certain years
-- we can maybe use avg and sum to get the money spent and customers acquired between 2017 - 2019
