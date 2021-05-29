-- Find SAT scores of students whose high school names do not end with 'HS'
select 
    * -- We dont care about certain info 
from sat_scores
where 
    RIGHT (school, 2) <>'HS' -- The right function uses the right most letters and the <> is the NOT EQUAL sumbol 
