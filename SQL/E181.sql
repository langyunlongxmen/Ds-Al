-- 181. Employees Earning More Than Their Managers
-- Write an SQL query to find the employees who earn more than their managers.
-- there is one table with "id, name, salary, managerId"

-- Soluion: 1. join e1.managerId = e2.id
--          2. filtered e1.salary > e2.salary


SELECT e1.name AS Employee
FROM Employee e1
JOIN Employee e2
ON e1.managerId = e2.id
WHERE e1.salary > e2.salary
;