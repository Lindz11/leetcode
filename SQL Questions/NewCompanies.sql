select 
    c.company_code,
    c.founder,
    count(DISTINCT e.lead_manager_code) as total_lead_managers, 
    count(DISTINCT e.senior_manager_code) as total_senior_managers, 
    count(DISTINCT e.manager_code) as total_managers,
    count(DISTINCT e.employee_code) as total_employees
from Company as c 
inner join Employee as e on c.company_code = e.company_code
group by c.founder,c.company_code
order by c.company_code

-- The employee table has all of the information that we need so we just need to join one table
-- This seem like I might have to do an inner query in from to have to data already processed and just pulled up to the query above. 
-- We only want distinct employees and not the duplicates 
-- The key to this question is it can be done without a join, and it you want it ordered by company code. 
