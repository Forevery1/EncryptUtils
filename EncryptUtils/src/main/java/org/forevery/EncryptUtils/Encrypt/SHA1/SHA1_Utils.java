package org.forevery.EncryptUtils.Encrypt.SHA1;


import static org.forevery.EncryptUtils.Encrypt.Utils.bytes2HexString;
import static org.forevery.EncryptUtils.Encrypt.Utils.hashTemplate;

/**
 * Created by Forevery on 2017/9/29.
 */

public class SHA1_Utils {

    /**
     * SHA1加密
     *
     * @param data 明文字符串
     * @return 16进制密文
     */
    public String Encrypt(final String data) {
        return Encrypt(data.getBytes());
    }

    /**
     * SHA1加密
     *
     * @param data 明文字节数组
     * @return 16进制密文
     */
    public String Encrypt(final byte[] data) {
        return bytes2HexString(Encrypt_Byte(data));
    }

    /**
     * SHA1加密
     *
     * @param data 明文字节数组
     * @return 密文字节数组
     */
    public byte[] Encrypt_Byte(final byte[] data) {
        return hashTemplate(data, "SHA1");
    }

}
