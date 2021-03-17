-- Return a distribution of users activity per day of the month. Your solution should consist of a day number 
-- (1-31) and the number of users activity for that day.
select 
    extract(day from post_date),
    count(poster)
from facebook_posts
group by post_date
