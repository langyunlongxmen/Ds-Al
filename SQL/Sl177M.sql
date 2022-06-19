CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      SELECT salary AS getNthHighestSalary
      FROM (
          SELECT DISTINCT salary, DENSE_RANK() OVER (ORDER BY salary DESC) rnk
          # SELECT DISTINCT Salary, DENSE_RANK() OVER (ORDER BY salary DESC) rnk
          FROM Employee     
      ) t
      WHERE t.rnk = N
  );
END