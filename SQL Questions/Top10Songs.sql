-- Top 10 Songs -- Find the number of songs of each artist which were ranked among the top 10 over the years. Order the result based on the number of top 10 ranked songs in descending order.
-- Step 1: Select the artist and use the count function for distinct song names no duplicates 
-- Step 2: Use the where filter to use to only select songs with song ranks < = 10
-- Step 3: Order by the number of top 10's in desc order 
select 
    artist, 
    count(DISTINCT song_name) as num_of_top_tens
from billboard_top_100_year_end
where year_rank <= 10
group by 1
order by num_of_top_tens desc
