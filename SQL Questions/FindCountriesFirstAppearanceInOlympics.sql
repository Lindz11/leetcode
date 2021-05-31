-- Anytime a question says first or something along with that. I means minimum 
-- Order all countries by the year they first participated in the Olympics.
-- Output the National Olympics Committee (NOC) name along with the desired year.
-- Sort records by the year and the NOC in ascending order.
select 
    min(year) as first_time_year, -- Find the minimum year 
    noc
from olympics_athletes_events
group by noc -- group it by the committee 
order by first_time_year, noc asc -- order it by the year and the committee 
