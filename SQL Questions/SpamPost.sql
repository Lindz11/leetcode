-- Spam Posts -- Calculate the percentage of spam posts in all viewed posts by day. Note that the facebook_posts table stores all posts posted by users. The facebook_post_views table is an action table denoting if a user has viewed a post.
-- Step 1: Use inner join to combine the two tables 
-- Step 2: Use case when and ilike to find the keyword spam on the posts that were viweded and spam 
select 
    p.post_date,
    count(case when p.post_keywords ilike '%spam%' then 1 else null end)/ count(v.viewer_id):: float * 100 as num_of_spams
from facebook_posts as p
inner join facebook_post_views as v 
on p.post_id = v.post_id
group by post_date
