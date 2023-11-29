### Neoris-Challange
Desafío para postulación a Empleo
### Challenge Solution

### Pruebas Postman

- Crear Usuario

1. Abrir Posmat 
2. Metodo: Post
3. Url: localhost:8080/users
4. Body: raw / JSON

{
    "name": "Juan Rodriguez",
    "email": "juan@rodriguez.org",
    "password": "hunter2",
    "phones": [
        {
        "number": "1234567",
        "citycode": "1",
        "contrycode": "57"
        }
    ]
}


- Listar Usuario 
1. Abrir Posmat 
2. Metodo: Get
3. Url: localhost:8080/users


###Diagrama Solución
                    
```seq
User->Challenge: Request 
Challenge->Database: Request
Database->Challenge: Response
Challenge->User: Respose
```

###End
