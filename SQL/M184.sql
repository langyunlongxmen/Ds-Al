-- 184.Department Highest Salary
-- 2 tables, table Employee with "id, name, salary, departmentId",
--           table Department with "id, name"
-- Write an SQL query to find employees who have the highest salary in each of the departments.

-- 
SELECT d.name Department, t.name Employee, t.salary Salary
FROM Department d
JOIN (
    SELECT name, salary, departmentId, DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS rnk
    FROM Employee 
    
) t
ON d.id = t.departmentId
WHERE t.rnk = 1
;

-- another way 
WITH cte AS (
    SELECT departmentid, name, salary, RANK() OVER (PARTITION BY departmentid ORDER BY salary DESC) AS rnk
    FROM employee
    )
    
SELECT d.name Department, c.name Employee, c.salary Salary
FROM cte c
JOIN department d
ON c.departmentid = d.id
WHERE c.rnk = 1
;