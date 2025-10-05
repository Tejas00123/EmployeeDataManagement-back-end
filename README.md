Setup
======
-I used STS IDE
-I developed using build tool Maven
-Tomcat 10.1 (port : 8383) url: http://localhost:8383
-Java version 21
-I used Oracle-sql database.

stater used : Spring Web, Spring Data Jpa, Oracle Driver, spring devtools, Lombok and etc.
-----------

Api end-points urls
==================

POST : Add employee
----
http://localhost:8383/EmpDataMgmt/api/employee/add

GET : show All employee
---
http://localhost:8383/EmpDataMgmt/api/employee/findAll

PUT : update Employee
------
http://localhost:8383/EmpDataMgmt/api/employee/update

PATCH : partial updatation of employee record
-----
http://localhost:8383/EmpDataMgmt/api/employee/update/eId/ePosition

DELETE : deleting employee record
------
http://localhost:8383/EmpDataMgmt/api/employee/delete/eId

GET : get employee by Id
---
http://localhost:8383/EmpDataMgmt/api/employee/get/eId

Note : I used @PathVariable in APIs which used in real world project api developemnet so don't give query string param values
Example url to how to test apis : 
http://localhost:8383/EmpDataMgmt/api/employee/delete/102

