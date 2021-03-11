-- for this problem the main things we want the query are the location and the popularity 
-- which we can pull sort based on the employess id 
-- and group based on the employees location 
select location, avg(facebook_hack_survey.popularity) as avg_popularity
from facebook_employees 
left outer join facebook_hack_survey 
on facebook_employees.id = facebook_hack_survey.employee_id
group by facebook_employees.location 
