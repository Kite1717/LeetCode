SELECT MAX(Salary) AS SecondHighestSalary
From Employee 
WHERE Salary < ( SELECT Max(Salary) FROM Employee)