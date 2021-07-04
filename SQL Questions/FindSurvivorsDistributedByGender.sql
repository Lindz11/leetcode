-- Find how the survivors are distributed by the gender and passenger classes.
-- Classes are categorized based on the pclass value as:
   -- pclass = 1: first_class
   -- pclass = 2: second_classs
   -- pclass = 3: third_class
-- Output the sex along with the corresponding number of survivors for each class.
select
    sex,
    count(case when survived = 1 and pclass = 1 then 1
    end) as first_class,
    count(case when survived = 1 and pclass = 2 then 1
    end) as second_class,
    count(case when survived = 1 and pclass = 3 then 1
    end) as third_class
from titanic
group by sex 
