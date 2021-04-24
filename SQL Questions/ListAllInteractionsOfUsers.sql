-- List all interactions of user with id 4 on either day 0 or 2.    
select * 
from facebook_user_interactions
where user1 = 4 OR user2 = 4 AND day = 0 OR day = 2
