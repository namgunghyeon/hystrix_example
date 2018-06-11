# Hystrix api example
넷플릭스 Hystrix를 사용해보기

# Structure
![image](./images/structure.png)
- Hystrix API(Spring boot)가 적용된 API에서 Request를 받고 해당 요청에 Dependency가 있는 API를 다시 호출 하는 방식
- AP1(Node), API2(Node), API3(Spring boot)를 강제로 Kill하면서 어떻게 동작하는지 확인

## Configuration
- Hystrix 설정

## Start
- main-api 실행
```
intelliJ로 실행
```
- api1 실행
- api2 실행
```
nvm use 10.4.0
npm run start
```

## Test Request
```
curl http://localhost:8085/api1
curl http://localhost:8085/api2
```

## Ping
- http://localhost:8085/hystrix.stream
![ping](./images/ping.png)


## Dashboard
- http://localhost:8085/hystrix
![dashboard](./images/dashboard.png)
