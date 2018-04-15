### 大数据开发中常用组件封装
- zookeeper
    - 名字服务,配置管理,组员管理
    - 互斥锁，读写锁, 屏障
    - http://www.aboutyun.com/thread-17636-1-1.html
- es
  - java-es
  - spark-es
  - spring-es
  - hive-es
- redis
  - spring-redis
  - java-redis
    - 单机分布式锁 jedis.set(lockKey, requestId, SET_IF_NOT_EXIST, SET_WITH_EXPIRE_TIME, expireTime);
    - 多节点分布式锁 redisson  https://github.com/redisson/redisson
- kafka
- netty
- spark
  - spark-sql
  - spark-streaming
