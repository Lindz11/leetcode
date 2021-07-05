-- Find all distinct sports that obese people participated in.
-- A person is considered as obese if his or her body mass index exceeds 30
select 
DISTINCT sport
from olympics_athletes_events
where weight is not null and height is not null and weight / ((height / 100) * (height / 100)) > 30
