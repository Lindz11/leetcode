-- Find colleges that produce the most NFL players.  Output the college name and the player count. Order the result based on the player count in descending order. Players that were not drafted into the NFL have 0s as values in the `pickround` column.
select 
college, 
count(pickround) as n_picks
from nfl_combine
where pick is NOT NULL
group by college
order by n_picks desc
