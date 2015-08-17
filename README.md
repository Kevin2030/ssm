#### SpringMVC、Spring、Mybatis整合
1. 项目基于Spring注解配置;  
2. 使用JDK1.7，数据库使用mysql，配置在ssm.properties里面修改，数据库表在sql目录下面，导入mysql里面即可;  
3. Maven管理项目，clone下来后，右键项目--Maven--update project，没有报错就ok.  

Tips:关于Maven的pom.xml文件报驱动错误修复方法  
Oracle驱动包添加到Maven本地仓库：  
1、网上下载oracle的驱动包；  
2、将驱动包名字修改为odbc14.jar，并且放在如下目录下面：C:/Users/Administrator/Desktop/odbc14.jar（可以随意放）  
3、执行下面命令  
mvn install:install-file -Dfile=C:/Users/Administrator/Desktop/odbc14.jar -DgroupId=com.oracle -DartifactId=ojdbc14 -Dversion=10.2.0.4  -Dpackaging=jar  
