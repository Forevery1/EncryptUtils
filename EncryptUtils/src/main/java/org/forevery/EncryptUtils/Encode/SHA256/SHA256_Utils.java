package org.forevery.EncryptUtils.Encode.SHA256;

import static org.forevery.EncryptUtils.Encode.Utils.bytes2HexString;
import static org.forevery.EncryptUtils.Encode.Utils.hashTemplate;

/**
 * Created by Forevery on 2017/9/29.
 */

public class SHA256_Utils {

    /**
     * SHA256加密
     *
     * @param data 明文字符串
     * @return 16进制密文
     */
    public String Encrypt(final String data) {
        return Encrypt(data.getBytes());
    }

    /**
     * SHA256加密
     *
     * @param data 明文字节数组
     * @return 16进制密文
     */
    public String Encrypt(final byte[] data) {
        return bytes2HexString(Encrypt_Byte(data));
    }

    /**
     * SHA256加密
     *
     * @param data 明文字节数组
     * @return 密文字节数组
     */
    public byte[] Encrypt_Byte(final byte[] data) {
        return hashTemplate(data, "SHA256");
    }


}
