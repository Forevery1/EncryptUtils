[![](https://jitpack.io/v/Forevery1/EncryptUtils.svg)](https://jitpack.io/#Forevery1/EncryptUtils)

* ### 加密解密
```
EncryptUtils.MD2()......                 : MD2加密
EncryptUtils.MD5()......                 : MD5加密/加密文件
EncryptUtils.SHA1()......                : SHA1加密
EncryptUtils.SHA224()......              : SHA224加密
EncryptUtils.SHA256()......              : SHA256加密
EncryptUtils.SHA384()......              : SHA384加密
EncryptUtils.SHA512()......              : SHA512加密
EncryptUtils.HmacMD5()......             : HmacMD5加密
EncryptUtils.HmacSHA1()......            : HmacSHA1加密
EncryptUtils.HmacSHA224()......          : HmacSHA224加密
EncryptUtils.HmacSHA256()......          : HmacSHA256加密
EncryptUtils.HmacSHA384()......          : HmacSHA384加密
EncryptUtils.HmacSHA512()......          : HmacSHA512加密
EncryptUtils.DES()......                 : DES解密/加密
EncryptUtils.T_3DES()......              : 3DES解密/加密
EncryptUtils.AES()......                 : AES加密/解密
```

* ### AES加密解密相关
```
算法模式:
   AES.CBC   : CBC模式
   AES.CFB   : CFB模式
   AES.ECB   : ECB模式
   AES.OFB   : OFB模式
补码方式:
   AES.PKCS5Padding  : PKCS5Padding方式
   AES.PKCS7Padding  : PKCS7Padding方式

   EncryptUtils.AES(int mode,String complement)........
例:
   EncryptUtils.AES(AES.CBC,AES.PKCS5Padding)........
```

## Download

Gradle:
```

allprojects {
    repositories {
	...
	maven { url 'https://jitpack.io' }
    }
}
  ```
  compile:
  ```
 dependencies {
     compile 'com.github.Forevery1:EncryptUtils:1.2'
}

```

##关于作者
```
  ヤ╄·杰ジ少ゞ
```
