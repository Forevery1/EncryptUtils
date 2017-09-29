package org.forevery.EncryptUtils.Encode.DES;

import static org.forevery.EncryptUtils.Encode.Utils.base64Decode;
import static org.forevery.EncryptUtils.Encode.Utils.base64Encode;
import static org.forevery.EncryptUtils.Encode.Utils.bytes2HexString;
import static org.forevery.EncryptUtils.Encode.Utils.desTemplate;
import static org.forevery.EncryptUtils.Encode.Utils.hexString2Bytes;

/**
 * Created by Forevery on 2017/9/29.
 */

public class DES_Utils {
    /**
     * DES转变
     * <p>法算法名称/加密模式/填充方式</p>
     * <p>加密模式有：电子密码本模式ECB、加密块链模式CBC、加密反馈模式CFB、输出反馈模式OFB</p>
     * <p>填充方式有：NoPadding、ZerosPadding、PKCS5Padding</p>
     */
    public String DES_Transformation = "DES/ECB/NoPadding";
    private final String DES_Algorithm = "DES";

    /**
     * DES加密后转为Base64编码
     *
     * @param data 明文
     * @param key  8字节秘钥
     * @return Base64密文
     */
    public byte[] Encrypt_Base64(final byte[] data, final byte[] key) {
        return base64Encode(Encrypt_Byte(data, key));
    }

    /**
     * DES加密后转为16进制
     *
     * @param data 明文
     * @param key  8字节秘钥
     * @return 16进制密文
     */
    public String Encrypt(final byte[] data, final byte[] key) {
        return bytes2HexString(Encrypt_Byte(data, key));
    }

    /**
     * DES加密
     *
     * @param data 明文
     * @param key  8字节秘钥
     * @return 密文
     */
    public byte[] Encrypt_Byte(final byte[] data, final byte[] key) {
        return desTemplate(data, key, DES_Algorithm, DES_Transformation, true);
    }

    /**
     * DES解密Base64编码密文
     *
     * @param data Base64编码密文
     * @param key  8字节秘钥
     * @return 明文
     */
    public byte[] Decrypt_Base64(final byte[] data, final byte[] key) {
        return Decrypt(base64Decode(data), key);
    }

    /**
     * DES解密16进制密文
     *
     * @param data 16进制密文
     * @param key  8字节秘钥
     * @return 明文
     */
    public byte[] Decrypt(final String data, final byte[] key) {
        return Decrypt(hexString2Bytes(data), key);
    }

    /**
     * DES解密
     *
     * @param data 密文
     * @param key  8字节秘钥
     * @return 明文
     */
    public byte[] Decrypt(final byte[] data, final byte[] key) {
        return desTemplate(data, key, DES_Algorithm, DES_Transformation, false);
    }
}
