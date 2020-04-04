# REDIS-CACHE 
This app use redis cache for storage data.

**Developed by Ing. Isaac Cerna**
NAME Origin for commits: origin24

-Need Redis Installation and start redis server in the console.

-Test endpints Postman:
http://localhost:8080/students -->Method Get (Get all students).

JSON Body create Student:
http://localhost:8080/students --> Method Post (Enroll Student).
{
	"firsname":"Isaac",
	"lastname":"Cerna",
	"emailAddress":"isaac@mail.com",
	"status":"ACTIVE"
}
  
For get for ID and delete use the same url  + id for the studen generated for redis.
