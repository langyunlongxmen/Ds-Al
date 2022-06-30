-- 183. Customers Who Never Order
-- 2 tables: table Customers with "id, name", table Orders with "id, customerId"
-- Write an SQL query to report all customers who never order anything.

--Solution: 1. find out the ordered customer id BY "SELECT customerId FROM Orders o";
--          2. SELECT name with "WHERE id NOT IN"

-- method 1
SELECT name AS Customers
FROM Customers 
WHERE id NOT IN (
    SELECT customerId
    FROM Orders o
)
;

-- method 2
SELECT Name AS 'Customers'
FROM Customers c
LEFT JOIN Orders o
ON c.Id = o.CustomerId
WHERE o.CustomerId IS NULL
;