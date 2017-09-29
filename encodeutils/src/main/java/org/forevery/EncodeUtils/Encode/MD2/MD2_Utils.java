package org.forevery.EncodeUtils.Encode.MD2;

import static org.forevery.EncodeUtils.Encode.Utils.bytes2HexString;
import static org.forevery.EncodeUtils.Encode.Utils.hashTemplate;

/**
 * Created by Forevery on 2017/9/29.
 */

public class MD2_Utils {
    /**
     * MD2加密
     *
     * @param data 明文字符串
     * @return 16进制密文
     */
    public String Encrypt(final String data) {
        return Encrypt(data.getBytes());
    }

    /**
     * MD2加密
     *
     * @param data 明文字节数组
     * @return 16进制密文
     */
    public String Encrypt(final byte[] data) {
        return bytes2HexString(Encrypt_Byte(data));
    }

    /**
     * MD2加密
     *
     * @param data 明文字节数组
     * @return 密文字节数组
     */
    public byte[] Encrypt_Byte(final byte[] data) {
        return hashTemplate(data, "MD2");
    }
}
