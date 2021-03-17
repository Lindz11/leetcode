-- Find users who are both a viewer and streamer.
select 
    user_id 
from twitch_sessions
group by user_id
having count(DISTINCT session_type) = 2
