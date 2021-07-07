-- Print the first name after removing white spaces from the left side.
select 
trim(first_name) as trimmed_name
from worker
