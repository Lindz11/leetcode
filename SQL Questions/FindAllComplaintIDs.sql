-- Find the complaint id for the processed complaints of type 1.
select 
     DISTINCT complaint_id -- We only want distinct id's 
from facebook_complaints
where processed= 'TRUE' and type = 1 -- Only want id's when they are both true and type 1 
