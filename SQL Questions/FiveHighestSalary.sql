-- Find the five highest salaries.
select 
     DISTINCT salary --  only want distinct salary 
from worker
order by salary desc -- order in descendent order 
LIMIT 5 -- we only want the 5 biggest salaries 
