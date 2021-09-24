-- Find the student with the highest efficiency for mathematics -- Find the student with the highest efficiency for mathematics?  The efficiency is defined as the score divided by hours studied. Output the result along with the student id, hours studies and the obtained score for mathematics. Sort the results based on the efficiency in the descending order.
-- Step 1: Select the student_id and the hrs_studied
-- Step 2: Select the sat_math score and cast as a float then divide it by the hrs_studied 
-- Step 3: Use Where to check that hrs studied is greater than 0 
select 
    student_id, 
    hrs_studied,
    sat_math,
    sat_math :: FLOAT / hrs_studied as efficiency
from sat_scores
where hrs_studied > 0
group by 1,2,3
order by efficiency desc 
LIMIT 1
