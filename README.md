Dubbo JSONRpc Demo
========================

Run Provider
---------------------

```bash
mvn jetty:run
```

Consumer Client:
--------------------------

CURL for test:
---------------------
```bash
curl -i -H 'content-type: application/json' -X POST -d '{"jsonrpc": "2.0", "method": "hello", "params": [ "World"],"id": 1 , "version":"1.0.0"}' 'http://127.0.0.1:8080/com.dubbo.demo.HelloService'
```

