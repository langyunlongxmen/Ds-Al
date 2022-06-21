-- Write an SQL query to find all numbers that appear 
-- at least three times consecutively.
-- Return the result table in any order.

SELECT DISTINCT l1.Num AS ConsecutiveNums
FROM Logs l1,
     Logs l2,
     Logs l3
WHERE l1.Id = l2.Id-1
     AND l2.Id = l3.Id -1
     AND l1.Num = l2.Num
     AND l1.Num = l3.Num
;