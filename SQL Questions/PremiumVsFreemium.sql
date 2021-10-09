-- Premium vs Freemium -- Find the total number of downloads for paying and non-paying users by date. Include only records where non-paying customers have more downloads than paying customers. The output should be sorted by earliest date first and contain 3 columns date, non-paying downloads, paying downloads.
select 
    d.date, 
    sum(case when a.paying_customer = 'no' then d.downloads else null end) as non_paying_customers, 
    sum(case when a.paying_customer = 'yes' then d.downloads else null end) as paying_customers
from ms_user_dimension as u 
join ms_acc_dimension as a on u.acc_id = a.acc_id
join ms_download_facts as d on u.user_id = d.user_id
group by 1
having sum(case when a.paying_customer = 'no' then d.downloads else null end) > sum(case when a.paying_customer = 'yes' then d.downloads else null end)
order by d.date desc 
