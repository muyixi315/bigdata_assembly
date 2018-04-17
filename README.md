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
    - 配置-注入-使用
  - hive-es
    - udf建立外部表
- mysql
    - druid 连接池
    - canal 模拟主从复制，同步 https://github.com/sasou/syncClient
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
    - 基于kafka direct方式，保存offset进zk,获取leader,更新，实现 恰好一次
- flume 
  - flume-ng
    - 自定义sink 
    - 自定义source
    - 自定义filter
- hadoop
    - hdfs
    - hive
    - hbase
      - 基于rowkey的精确查询，以及小段扫描查询，即由LSM-Tree(Log-Structured Merge-Tree) + HTable(region分区) + Cache决定     
- sqoop
    - hive 与 mysql、postgresql 导数
    - 常被运用于拼接指令,提交shell执行
- strom
    - blot sport nibus 实时
    - kafkaspout.nextTuple
    - 异或运算  
         - 与（&）	0 & 0 = 0	1 & 0 = 0	0 & 1 = 0	1 & 1 = 1
         - 或（|）	0 | 0 = 0	1 | 0 = 1	0 | 1 = 1	1 | 1 = 1
         - 异或（^）	0 ^ 0 = 0	1 ^ 0 = 1	0 ^ 1 = 1	1 ^ 1 = 0
            - 异或自己＝把自己置0
            - 

