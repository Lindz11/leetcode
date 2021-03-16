select 
    first_name
from employee
where 
    department = 'Sales' and target > 150
order by first_name 
