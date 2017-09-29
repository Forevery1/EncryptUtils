package org.forevery.EncryptUtils.Encrypt.T_3DES;

import static org.forevery.EncryptUtils.Encrypt.Utils.base64Decode;
import static org.forevery.EncryptUtils.Encrypt.Utils.base64Encode;
import static org.forevery.EncryptUtils.Encrypt.Utils.bytes2HexString;
import static org.forevery.EncryptUtils.Encrypt.Utils.desTemplate;
import static org.forevery.EncryptUtils.Encrypt.Utils.hexString2Bytes;

/**
 * Created by Forevery on 2017/9/29.
 */

public class T_3DES_Utils {
    /**
     * 3DES转变
     * <p>法算法名称/加密模式/填充方式</p>
     * <p>加密模式有：电子密码本模式ECB、加密块链模式CBC、加密反馈模式CFB、输出反馈模式OFB</p>
     * <p>填充方式有：NoPadding、ZerosPadding、PKCS5Padding</p>
     */
    public String TripleDES_Transformation = "DESede/ECB/NoPadding";
    private final String TripleDES_Algorithm = "DESede";


    /**
     * 3DES加密后转为Base64编码
     *
     * @param data 明文
     * @param key  24字节秘钥
     * @return Base64密文
     */
    public byte[] Encrypt_Base64(final byte[] data, final byte[] key) {
        return base64Encode(Decrypt_Byte(data, key));
    }

    /**
     * 3DES加密后转为16进制
     *
     * @param data 明文
     * @param key  24字节秘钥
     * @return 16进制密文
     */
    public String Encrypt(final byte[] data, final byte[] key) {
        return bytes2HexString(Encrypt_Byte(data, key));
    }

    /**
     * 3DES加密
     *
     * @param data 明文
     * @param key  24字节密钥
     * @return 密文
     */
    public byte[] Encrypt_Byte(final byte[] data, final byte[] key) {
        return desTemplate(data, key, TripleDES_Algorithm, TripleDES_Transformation, true);
    }

    /**
     * 3DES解密Base64编码密文
     *
     * @param data Base64编码密文
     * @param key  24字节秘钥
     * @return 明文
     */
    public byte[] Decrypt(final byte[] data, final byte[] key) {
        return Decrypt_Byte(base64Decode(data), key);
    }

    /**
     * 3DES解密16进制密文
     *
     * @param data 16进制密文
     * @param key  24字节秘钥
     * @return 明文
     */
    public byte[] Decrypt(final String data, final byte[] key) {
        return Decrypt_Byte(hexString2Bytes(data), key);
    }

    /**
     * 3DES解密
     *
     * @param data 密文
     * @param key  24字节密钥
     * @return 明文
     */
    public byte[] Decrypt_Byte(final byte[] data, final byte[] key) {
        return desTemplate(data, key, TripleDES_Algorithm, TripleDES_Transformation, false);
    }
}
