-- Product Transaction Count -- Find the number of transactions that occurred for each product. Output the product name along with the corresponding number of transactions and order records by the product id in ascending order. You can ignore products without transactions.
-- Step 1: We right join since we mostly care about the transaction table
-- Step 2: We select the product name and the count of the transaction_id
-- Step 3: We group by the product name 
select 
    product_name, 
    count(transaction_id) as num_of_transactions
from excel_sql_inventory_data as i 
right join excel_sql_transaction_data as t 
on i.product_id = t.product_id
group by product_name
