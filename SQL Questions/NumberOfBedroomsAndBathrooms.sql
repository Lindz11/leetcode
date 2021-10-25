-- Number Of Bathrooms And Bedrooms -- Find the average number of bathrooms and bedrooms for each city’s property types. Output the result along with the city name and the property type.
SELECT 
    AVG(bathrooms) as bath_avg, 
    AVG(bedrooms) as bed_avg, 
    property_type,
    city
FROM airbnb_search_details
group by 3,4
order by bath_avg desc, bed_avg desc
