-- 185.Department Top Three Salaries
-- 2 tables, table Employee with "id, name, salary, departmentId",
--           table Department with "id, name"
-- A company's executives are interested in seeing who earns the most money in each of the company's departments. 
-- A high earner in a department is an employee who has a salary in the top three unique salaries for that department.

-- method 1
SELECT d.name Department, t.name Employee, t.salary Salary
FROM Department d
JOIN (
    SELECT name, salary, departmentId, DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS rnk
    FROM Employee 
    
) t
ON d.id = t.departmentId
WHERE t.rnk <= 3
;

-- method 2
SELECT s.Department, s.Employee, s.Salary
FROM(
    SELECT d.Name Department, e.Name Employee, e.Salary,
           DENSE_RANK() OVER (PARTITION BY d.Name ORDER BY e.Salary DESC) ranked_sal
    FROM Employee e
    JOIN Department d
    ON d.Id = e.DepartmentId
) s
WHERE s.ranked_sal < 4
;