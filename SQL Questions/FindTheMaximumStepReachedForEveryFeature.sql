-- Find the maximum step reached for every feature. Output the feature id along with its maximum step.
select 
feature_id,
max(step_reached) as max_step_reached
from facebook_product_features_realizations
group by feature_id
