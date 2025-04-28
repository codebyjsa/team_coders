# Guide to run the code

## Requirements

1. Apache Kafka should be installed in your Local Device. [Tutorial](https://youtu.be/YbSC1OsLp20?si=3z7VsWBt8BT1YNx1&t=665) for this

## How to start the appilcation

### In your terminal
1. First Start ```Zookeeper``` service
```bash 
bin/zookeeper-server-start.sh config/zookeeper.properties
```

2. Then run ```Kafka```
```bash
bin/kafka-server-start.sh config/server.properties
```

### In your IDE
Simply run your Apllication

## Enjoy :)
