-- Find the best actors/actresses of all time based on the number of Oscar awards. 
select 
nominee, 
count(winner) as num_of_oscars_won
from oscar_nominees
where winner = 'TRUE'
group by nominee
order by num_of_oscars_won desc 

-- we want to output nominee, num_of_oscars_won
-- we want to check for when winner is flagged as true 
-- it wants them in desc order 
-- do we have to output all of just one of each. I asssume all since it says plural
