-- 196. Delete Duplicate Emails
-- one table, table Person with "id, email"
-- Write an SQL query to delete all the duplicate emails, keeping only one unique email with the smallest id. 
-- Note that you are supposed to write a DELETE statement and not a SELECT one.

--Solution: 1.manipulate two same table with "WHERE p1.email = p2.email AND p1.id>p2.id"
--          2.set rank variable, "RANK() OVER (PARTITION BY email ORDER BY id)"


-- method 1 (take more time)
DELETE p1
FROM Person p1, Person p2
WHERE p1.email = p2.email AND p1.id>p2.id
;

-- method 2 (better)
DELETE 
FROM person
WHERE id NOT IN (
    SELECT id
    FROM (
        SELECT id, email, RANK() OVER (PARTITION BY email ORDER BY id) rnk
        FROM person
    ) t
    WHERE t.rnk = 1
)
;