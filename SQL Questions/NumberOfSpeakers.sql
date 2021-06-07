-- Find the number of speakers of each language by country. Output the country, language, 
-- and the corresponding number of speakers. Output the result based on the country in ascending order.
select  
    playbook_events.location, -- we want to pick out the location
    playbook_users.language, -- we want to pick out the language 
    count(DISTINCT playbook_events.user_id) as num_of_people -- we need DISTINCT users no duplicates
from playbook_events
inner join playbook_users 
on  playbook_users.user_id =  playbook_events.user_id -- inner join both based on the id's 
group by playbook_events.location,  playbook_users.language -- group by the language and the location
order by   playbook_events.location asc -- and order in asc order 
