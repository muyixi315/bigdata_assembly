### 大数据开发中常用组件封装
- zookeeper
    - 名字服务,配置管理,组员管理
    - 互斥锁，读写锁, 屏障
    - http://www.aboutyun.com/thread-17636-1-1.html
- duddo
    - 服务提供方Provider ，消费方Consumer，在Registry上注册服务，当本地方法一样调用，    
- es
  - java-es
    - 判断index，type,document是否存在,根据id查询，根据id插入或更新，分页查询scroll
  - spark-es
  - spring-es
  - hive-es
    - udf建立外部表
- redis
  - spring-redis
  - java-redis
    - 单机分布式锁 jedis.set(lockKey, requestId, SET_IF_NOT_EXIST, SET_WITH_EXPIRE_TIME, expireTime);
    - 多节点分布式锁 redisson  https://github.com/redisson/redisson
- kafka
  - java-kafka
  - spark-kafka
  - strom-kafka
- netty
  - 异步io模型，   阻塞IO→非租塞seletor模型→线程复用→异步io
- spark
  - spark-sql
  - spark-streaming
- flume 
  - flume-ng
    - 自定义sink  
