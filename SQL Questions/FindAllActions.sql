-- Find all actions which occurred more than once in the weblog.
select 
    action -- want to select all actions 
from facebook_web_log
group by action
having count(action) > 1 -- then only look at the ones in the action column where they have more than 1 
