-- Find all users that have performed at least one scroll_up event.
select 
    DISTINCT user_id 
from facebook_web_log
where action = 'scroll_down'
