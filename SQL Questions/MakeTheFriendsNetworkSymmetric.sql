-- Make the friends network symmetric. For example, if 0 and 1 are friends, have the output contain both 0 and 1 under 1 and 0 respectively.
select 
user_id as friend_id,
friend_id as user_id
from google_friends_network
union 
select 
friend_id, user_id 
from google_friends_network

-- This is pretty much a swap problem without being able to use the swap function
