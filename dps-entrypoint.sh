#!/usr/bin/env bash
# -Djava.rmi.server.hostname=127.0.0.1 \

java \
-Dcom.sun.management.jmxremote.port=8089 \
-Dcom.sun.management.jmxremote.rmi.port=8089 \
-Dcom.sun.management.jmxremote.ssl=false \
-Dcom.sun.management.jmxremote.authenticate=false \
-jar /app/dps-demo-1.0.jar.jar