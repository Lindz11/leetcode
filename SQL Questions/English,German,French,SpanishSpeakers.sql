-- English, German, French, Spanish Speakers -- Find ids of companies that have more than 10 users who speak English, German, French, or Spanish.
-- Step 1: Select the company_id
-- Step 2: Filter out the companies with less than 10 employees
-- Step 3: Use where clause to select the needed languages 
select 
company_id
from playbook_users
where language in ('english', 'german', 'french', 'spanish')
group by 1
having (count(distinct user_id)) > 10 
