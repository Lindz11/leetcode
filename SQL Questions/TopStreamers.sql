-- Top Streamers who have more streaming sessions than viewing sessions
select 
    user_id, 
    count(session_type) FILTER (where session_type = 'streamer') as streaming,
    count(session_type) FILTER (where session_type = 'viewer') as view
from twitch_sessions
group by user_id
having count(session_type) FILTER (where session_type = 'streamer') > count(session_type) FILTER (where session_type = 'viewer')

-- Have to find a more efficient way to filter by aggregate functions 
