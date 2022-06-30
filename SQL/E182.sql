-- 182. Duplicate Emails
-- one table with "id, email"
-- write an Sql to report all the duplicate emails

-- method 1
SELECT DISTINCT p1.email AS Email
FROM Person p1, Person p2
WHERE p1.id != p2.id and p1.email = p2.email
;

-- method 2 (better one)
SELECT email AS Email
FROM Person
GROUP BY 1
HAVING COUNT(email) > 1
;