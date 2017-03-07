


和手动建立目录的 tech06MavenHello 一样

1.只是转化为eclipse项目
命令为：
cmd跳到（D:\work\eclipse\workspace-jee-techstar\tech06MavenHelloIDE）执行：
mvn eclipse:eclipse

2.目前的命令：
mvn -v
mvn eclipse:eclipse
mvn clean
mvn clean compile
mvn clean test
mvn clean package
mvn clean install

其他：
mvn generate-sources
mvn build
命令行创建Maven项目
mvn archetype:generate



以下为 tech06MavenHello(手动敲写) 的说明：

cmd 跳转到 D:\work\eclipse\workspace-jee\tech06MavenHello

1.编译
mvn clean compile
2.测试
mvn clean test
3.打包 - pom中没有配置打包类型，则使用默认的类型： jar
mvn clean package

4.其他项目使用该包,会安装到本地仓库，如同前面的junit，只有下载本地仓库后才能被其他maven项目引用
mvn clean install

5.运行：
java -jar target\hellomaven-1.0-SNAPSHOT.jar

6.直接运行不能出结果，因为带有main方法的类信息不会添加到manifest中
需要加： maven-shade-plugin
加到配置中 <build>...</build>
生成两个：
（前者是带有Main-Class信息的可运行jar {带有Main-Class: com.techstar.hellomaven.HelloMaven}，
后者是原始jar）
hellomaven-1.0-SNAPSHOT.jar  
original-hellomaven-1.0-SNAPSHOT.jar

7.重新打包并运行：
java -jar target\hellomaven-1.0-SNAPSHOT.jar
可出结果


8.以上所有的操作的库都会默认为
${user.home}/.m2/repository
如
C:\Users\malitao\.m2\repository

若想用北京最全的库，需要在其中添加 settings.xml ，修改配置为：
<settings>
  <localRepository>D:/work/maven/.m2/repository</localRepository>
</settings>

##这个暂时未用
默认每个用户会都拥有一个本地仓库，如果想让所有用户都使用一个仓库，可以修改Maven安装目录下的setting.xml: 
${M2_HOME}/conf/setting.xml


