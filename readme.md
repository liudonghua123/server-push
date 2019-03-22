https://stackoverflow.com/questions/38250271/creating-a-jks-from-a-crt-and-key-file-is-that-possible

1. crt + key -> pfx
   openssl pkcs12 -export -out liudonghua.com.pfx -inkey liudonghua.com.key -in liudonghua.com.crt -password pass:liudonghua

2. pfx -> jks
   keytool -importkeystore -srckeystore liudonghua.com.pfx -srcstoretype pkcs12 -destkeystore liudonghua.com.jks -deststoretype jks -srcalias 1 -srcstorepass liudonghua -deststorepass liudonghua -destalias liudonghua.com
