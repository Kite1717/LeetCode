Select Person.Email
From Person
Group By Email
Having Count(Email) > 1