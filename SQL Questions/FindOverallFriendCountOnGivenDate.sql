-- Find the overall friend acceptance count for a given date. Assume the date is 2nd of January 2019.
-- You can use count on all the data and then filter on the date approved u are searching for 
select 
    count(*)
from facebook_friendship_requests
where date_approved='2019-01-02'
