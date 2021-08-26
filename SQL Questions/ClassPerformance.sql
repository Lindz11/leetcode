-- Class performance -- You are given a table containing assignment scores of students in a class. Write a query that identifies the largest difference in total score of all assignments.
-- step 1: calculate the summations of the assignments 
-- step 2: Find the max and min summations 
-- step 3: Subtract them to find the max difference 
select 
    max(scores) - min(scores) as difference_in_scores 
from 
(
    select 
        student,
        sum(assignment1 + assignment2 + assignment3) as scores 
    from box_scores 
    group by student
) as b
