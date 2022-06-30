-- 197. Rising Temperature
-- one table, table Weather with "id, recordDate, temperature"
-- Write an SQL query to find all dates' Id with higher temperatures compared to its previous dates (yesterday).

-- method 1 (better)
SELECT id
FROM
(SELECT *, 
    LAG(temperature,1) OVER (ORDER BY recordDate)  as prevTemp,
    LAG(recordDate,1) OVER (ORDER BY recordDate)  as prevDate
    FROM Weather) a
WHERE temperature > prevTemp
AND DATEDIFF(recordDate,prevDate) = 1;

-- method 2
SELECT
    weather.id AS 'Id'
FROM
    weather
        JOIN
    weather w ON DATEDIFF(weather.recordDate, w.recordDate) = 1
        AND weather.Temperature > w.Temperature
;