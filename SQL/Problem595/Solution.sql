# Write your MySQL query statement below
/*Runtime: 314 ms, faster than 75.07% of MySQL online submissions for Big Countries.*/
select W.name, W.population,W.area
from world W
where W.area> 3000000 OR W.population> 25000000 