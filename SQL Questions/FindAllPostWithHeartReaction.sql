-- When doing joins you can give a keyword for the tables 
-- Find all posts which were reacted to with a heart.
select 
DISTINCT 
rs. *
from facebook_reactions ps -- from with the name ps 
inner join facebook_posts rs -- join the other table with the name rs 
on rs.post_id = ps.post_id -- joining the two tables based on the id's 
where reaction = 'heart' -- we only want the post that have the reaction of a heart 
