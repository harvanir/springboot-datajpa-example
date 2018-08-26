# spring-datajpa-example (Postgresql)

### How to use

**1. Execute db info**
```
mvn flyway:info
```

**2. Execute db migrate**
```
mvn flyway:migrate
```

**3. Use API**
```
1. GET: localhost:8084/jobhistory/
2. POST: localhost:8084/jobhistory/
   PAYLOAD: {
            	"startTime": null,
            	"message": "message1"
            }
3. GET: localhost:8084/jobhistory/{jobHistoryId}
```
