apktool d app-release3.apk // 反编译成文件
apktool b app-release -o app1127_new.apk // 重新打包
jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore store.jks -storepass 123456 app1127_new.apk tj // 重新签名
zipalign 4 app1127_new.apk app1127_new_align.apk // 字节对齐优化