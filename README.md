Setup
======
| Configuration    | Details                                        |
| ---------------- | ---------------------------------------------- |
| **IDE**          | Spring Tool Suite (STS)                        |
| **Build Tool**   | Maven                                          |
| **Server**       | Tomcat 10.1 (Port: `8383`)                     |
| **Java Version** | Java 21                                        |
| **Database**     | Oracle SQL                                     |
| **URL**          | [http://localhost:8383](http://localhost:8383) |


🧩 Dependencies / Starters Used

Spring Web

Spring Data JPA

Oracle Driver

Lombok

Spring Boot DevTools

(and other common dependencies)

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

