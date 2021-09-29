-- Number of Comments Per User in Past 30 days -- Return the total number of comments received for each user in the last 30 days. Assume today is 2020-02-10.
-- Step 1: Select the user_id, and count function on number of comments
-- Step 2: Use where to to filter until the date provided 
--
select 
    user_id, 
    sum(number_of_comments) as num_of_comments 
from fb_comments_count
where created_at between '2020-02-10'::date - 30 * INTERVAL '1 day' and '2020-02-10'::date
group by 1
order by num_of_comments desc 
