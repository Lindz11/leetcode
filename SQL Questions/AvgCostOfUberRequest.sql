-- Find the average cost of each request status. Request status can be either 'success' or 'fail'.
-- Output the request status along with the average cost.
select 
    request_status, -- We want to pick all of the request status 
    avg(monetary_cost) as avg_costs -- We want to find the avg cost of all of the uber rides 
from uber_ride_requests
group by request_status 
