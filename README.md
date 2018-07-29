##### 1、git远程仓库用的是方神的远程仓库

##### 2、访问http://localhost:8888/foo/dev
       
      {"name":"foo","profiles":["dev"],"label":"master",
      "version":"792ffc77c03f4b138d28e89b576900ac5e01a44b","state":null,"propertySources":[]}

 证明配置服务中心可以从远程程序获取配置信息。
 
 
##### 3、http://localhost:8881/config-client  显示foo version 2
说明config-client从config-server获取了foo的属性，而config-server是从git仓库读取的