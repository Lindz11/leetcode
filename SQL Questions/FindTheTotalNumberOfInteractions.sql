-- Find the total number of interactions on days 0 and 2. Output the result alongside the day.
select
    day,
    count(day) as n_interactions
from facebook_user_interactions
where day = 0 or day = 2
group by day
