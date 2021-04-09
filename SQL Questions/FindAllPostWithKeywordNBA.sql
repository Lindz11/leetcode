-- Find all posts with the keyword 'nba'
select * 
from facebook_posts
where post_keywords ilike '%nba%'
