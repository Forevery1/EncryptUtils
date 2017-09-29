package org.forevery.EncryptUtils.Encrypt.HmacSHA1;


import static org.forevery.EncryptUtils.Encrypt.Utils.bytes2HexString;
import static org.forevery.EncryptUtils.Encrypt.Utils.hmacTemplate;

/**
 * Created by Forevery on 2017/9/29.
 */

public class HmacSHA1_Utils {

    /**
     * HmacSHA1加密
     *
     * @param data 明文字符串
     * @param key  秘钥
     * @return 16进制密文
     */
    public String Encrypt(final String data, final String key) {
        return Encrypt(data.getBytes(), key.getBytes());
    }

    /**
     * HmacSHA1加密
     *
     * @param data 明文字节数组
     * @param key  秘钥
     * @return 16进制密文
     */
    public String Encrypt(final byte[] data, final byte[] key) {
        return bytes2HexString(Encrypt_Byte(data, key));
    }

    /**
     * HmacSHA1加密
     *
     * @param data 明文字节数组
     * @param key  秘钥
     * @return 密文字节数组
     */
    public byte[] Encrypt_Byte(final byte[] data, final byte[] key) {
        return hmacTemplate(data, key, "HmacSHA1");
    }
}
