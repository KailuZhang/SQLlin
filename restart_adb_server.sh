#Restart adb server
echo "${ANDROID_HOME}"
export PATH=${PATH}:${ANDROID_HOME}/platform-tools
adb kill adb-server
adb start adb-server