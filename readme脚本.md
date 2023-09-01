#### 一、脚本命令

1. 反编译成文件

```java
apktool d app-release.apk
```

2. 重新打包

```java
apktool b app-release -o app_new.apk
```

3. 重新签名

```java
jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore store.jks -storepass 123456 app_new.apk tj
```

4. 字节对齐优化

```java
zipalign 4 app_new.apk app_new_align.apk
```

#### 二、签名信息

```java
alia:tj
password:123456
```

#### 三、dex2jar与jd-gui(反编译代码)

1. apk改名为.zip文件，解压工具解压，拿到dex文件

   ```
   d2j-dex2jar classes.dex
   ```

2. 使用jd-gui工具打开classes-dex2jar.jar（上面生成的jar产物）

   ![img](https://img-blog.csdn.net/20160204162548914)

#### 四、参考链接

[1.鸿洋反编译博客](https://blog.csdn.net/lmj623565791/article/details/53370414?spm=1001.2014.3001.5502)

[2.郭霖反编译博客](https://guolin.blog.csdn.net/article/details/49738023?spm=1001.2014.3001.5502)

[3.demo项目地址](https://github.com/Jeffery336699/Decompile)

#### 五、源工具地址

> C:\decompile

#### 六、实践问题

1. 实践郭霖博客例子 , 发现代码通过smile文件修改很容易 , 但是资源修改不生效?! (eg 修改ic_launcher图片)