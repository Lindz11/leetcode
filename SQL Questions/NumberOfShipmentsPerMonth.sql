-- Number of Shipments Per Month -- Write a query that will calculate the number of shipments per month. The unique key for one shipment is a combination of shipment_id and sub_id. Output the year_month in format YYYY-MM and the number of shipments in that month.
-- Step 1: Extract the month from each shipment date
-- Step 2: Use the sum function to count the number of shipmentids per month 
select 
    to_char (shipment_date, 'YYYY-MM') as year_month,
    count(shipment_id) as num_of_shipments
from amazon_shipment
group by year_month
order by num_of_shipments desc 
