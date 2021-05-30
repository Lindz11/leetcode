-- Find the number of posts which were reacted to with a like.
select 
    count(DISTINCT facebook_reactions.post_id) -- We only want the unique number of posts id's 
from facebook_reactions
inner join facebook_posts 
on facebook_reactions.poster = facebook_posts.poster -- we want to join on both posters
where reaction = 'like' -- We only want the posts that have likes 
