# selise-test

Sample request:
```
curl --request POST \
  --url http://localhost:8090/account/validate\
  --header 'Content-Type: application/json' \
  --data '{
        "requestId": "A32W4ER2341",
        "accountName": "TXIuIE5henJ1bCBJc2xhbQ==",
        "amount": "SCNVQFV3V0tiY0wh"
}'
```

Response: 

```
{
	"step1": "Mr. Nazrul Islam",
	"step2": "H#U@UwWKbcL!",
	"step3": "HUUwWKbcL",
	"step4": "IVVxXLcdM",
	"step5": "IVVXXLCDM",
	"step6": "1681",
	"step7": "MDCLXXXI"
}
```
