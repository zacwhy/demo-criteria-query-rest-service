# Criteria Query Rest Service Demo

Dependency: https://github.com/zacwhy/demo-criteria-query

## Selecting 1 field

HTTP GET Request:
```sh
http://localhost:8080/employees?fields=firstName
```

Response:
```json
[
  {"firstName":"FirstName1"},
  {"firstName":"FirstName2"},
  {"firstName":"FirstName3"}
]
```

## Selecting 2 fields

HTTP GET Request:
```sh
http://localhost:8080/employees?fields=firstName,lastName
```

Response:
```json
[
  {"firstName":"FirstName1","lastName":"LastName1"},
  {"firstName":"FirstName2","lastName":"LastName2"},
  {"firstName":"FirstName3","lastName":"LastName3"}
]
```
