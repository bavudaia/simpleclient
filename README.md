# simpleclient restful web service



This app will get
Clientid , data pair as a request 

1) POST : 
    Request URL : http://localhost:5000//webapi/simpleclient/clients
    {
    id : 1,
    data : "client1"
    }
    This will register the client id and data to the hash map.
    
2) GET :
    Request URL : http://localhost:5000//webapi/simpleclient/clients
    Retrieves list of clients in JSON format
    
3) GET:
    Request URL : http://localhost:5000//webapi/simpleclient/clients/clientID
    clientId is an integer that denotes the client id registered in the hash map(DB)
    
