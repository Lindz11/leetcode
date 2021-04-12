-- Find all friends who liked a post.
select 
    DISTINCT friend 
from facebook_reactions
where reaction = 'like'
