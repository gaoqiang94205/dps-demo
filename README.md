# 远程debug docker springboot
## 项目启动脚本entrypoint.sh
```
-Dcom.sun.management.jmxremote.port=8089 \
-Dcom.sun.management.jmxremote.rmi.port=8089 \
-Dcom.sun.management.jmxremote.ssl=false \
-Dcom.sun.management.jmxremote.authenticate=false \
```
## 构建镜像
docker build -t xxxx .
## 启动镜像
docker run -d -p 30080:8080 18089:8089 image:1.0
## jconsole连接
输入<ip:port>连接