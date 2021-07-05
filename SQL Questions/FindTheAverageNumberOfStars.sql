-- Find the average number of stars for each state. Output the state name along with the corresponding average number of stars.
select 
state, 
avg(stars) as avg_num_stars
from yelp_business
group by state
