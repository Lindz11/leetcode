-- Total Monatery Value Per Month/Service
select   
        sum(monetary_value) FILTER (where service_name = 'Uber_BOX') as uber_box,
        sum(monetary_value) FILTER (where service_name = 'Uber_CLEAN') as uber_clean,
        sum(monetary_value) FILTER (where service_name = 'Uber_FOOD') as uber_food,
        sum(monetary_value) FILTER (where service_name = 'Uber_GLAM') as uber_glam,
        sum(monetary_value) FILTER (where service_name = 'Uber_KILAT') as uber_kilat,
        sum(monetary_value) FILTER (where service_name = 'Uber_MART') as uber_mart,
        sum(monetary_value) FILTER (where service_name = 'Uber_RIDE') as uber_ride,
        sum(monetary_value) FILTER (where service_name = 'Uber_MASSAGE') as uber_massage,
        sum(monetary_value) FILTER (where service_name = 'Uber_SEND') as uber_send,
        sum(monetary_value) FILTER (where service_name = 'Uber_SHOP') as uber_shop,
        sum(monetary_value) FILTER (where service_name = 'Uber_TIX') as uber_tix,
        date_part('month',order_date) as month
from uber_orders
where status_of_order = 'Completed'
group by month

-- This problem is kind of long, have to try and find a better alternative 
-- date_part is important when wanting to disect a year,month,day
