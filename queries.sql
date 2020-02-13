## Part 1: Test it with SQL
column names : id, employer, name, skills
data types : int, varchar(255), varchar(255), varchar(255)
## Part 2: Test it with SQL
SELECT * FROM Employer WHERE location = 'St. Louis City'
## Part 3: Test it with SQL
DROP TABLE job
## Part 4: Test it with SQL
SELECT s.name, s.skill_description
FROM skill s
LEFT JOIN job_skills js ON js.skills_id = s.Id
LEFT JOIN job j ON j.id = js.jobs_id
WHERE j.id IS NOT NULL
ORDER BY s.name

