select id,first_name,last_name,department_id,MAX(salary)
FROM ms_employee_salary ms 
GROUP BY id,first_name,last_name,department_id
ORDER BY id;
