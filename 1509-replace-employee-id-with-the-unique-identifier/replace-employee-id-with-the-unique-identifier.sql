# Write your MySQL query statement below
select IFNULL(EmployeeUNI.unique_id, null) as unique_id, Employees.name
from Employees
left join EmployeeUNI
on Employees.id = EmployeeUNI.id