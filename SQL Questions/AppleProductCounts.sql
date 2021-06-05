-- Need to make sure to read the question thoroughly and count the correct things 
-- Find the number of Apple product users and the number of total users with a device for each language. 
-- Assume Apple products are only MacBook-Pro, iPhone 5s, and iPad-air. Output the language along 
-- with the total number of Apple users and users with any device. Order our results based on the number 
-- of total users in descending order.
select
    playbook_users.language,-- we need to pick by language 
    count(DISTINCT case -- Use a case when with a in to search for macbooks,iphones,and ipads
        when playbook_events.device IN ('macbook pro',
                                        'iphone 5s',
                                        'ipad air' ) then playbook_users.user_id
       
        else null 
        end) as n_apple_users,
    count(DISTINCT playbook_users.user_id) as n_total_users -- count each distinct user in the dataset 
from playbook_events
inner join playbook_users on playbook_users.user_id = playbook_events.user_id -- do a inner join based on the id's
group by playbook_users.language -- group by language 
order by n_total_users desc -- We want it ordered in desc order
