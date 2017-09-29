package org.forevery.EncodeUtils;

import org.forevery.EncodeUtils.Encode.AES.Aes_Util;
import org.forevery.EncodeUtils.Encode.DES.DES_Utils;
import org.forevery.EncodeUtils.Encode.HmacMD5.HmacMD5_Utils;
import org.forevery.EncodeUtils.Encode.HmacSHA1.HmacSHA1_Utils;
import org.forevery.EncodeUtils.Encode.HmacSHA224.HmacSHA224_Utils;
import org.forevery.EncodeUtils.Encode.HmacSHA256.HmacSHA256_Utils;
import org.forevery.EncodeUtils.Encode.HmacSHA384.HmacSHA384_Utils;
import org.forevery.EncodeUtils.Encode.HmacSHA512.HmacSHA512_Utils;
import org.forevery.EncodeUtils.Encode.MD2.MD2_Utils;
import org.forevery.EncodeUtils.Encode.MD5.MD5_Utils;
import org.forevery.EncodeUtils.Encode.RC4.RC4_Utils;
import org.forevery.EncodeUtils.Encode.SHA1.SHA1_Utils;
import org.forevery.EncodeUtils.Encode.SHA224.SHA224_Utils;
import org.forevery.EncodeUtils.Encode.SHA256.SHA256_Utils;
import org.forevery.EncodeUtils.Encode.SHA384.SHA384_Utils;
import org.forevery.EncodeUtils.Encode.SHA512.SHA512_Utils;
import org.forevery.EncodeUtils.Encode.T_3DES.T_3DES_Utils;

/**
 * Created by Forevery on 2017/9/29.
 */

public class EncodeUtils {

    private EncodeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * AES 加密
     */
    public static Aes_Util AES() {
        return new Aes_Util();
    }

    /**
     * RC4 加密
     */
    public static RC4_Utils RC4() {
        return new RC4_Utils();
    }

    /**
     * MD2 加密
     */
    public static MD2_Utils MD2() {
        return new MD2_Utils();
    }

    /**
     * MD5 加密
     */
    public static MD5_Utils MD5() {
        return new MD5_Utils();
    }

    /**
     * SHA1 加密
     */
    public static SHA1_Utils SHA1() {
        return new SHA1_Utils();
    }

    /**
     * SHA224 加密
     */
    public static SHA224_Utils SHA224() {
        return new SHA224_Utils();
    }

    /**
     * SHA256 加密
     */
    public static SHA256_Utils SHA256() {
        return new SHA256_Utils();
    }

    /**
     * SHA384 加密
     */
    public static SHA384_Utils SHA384() {
        return new SHA384_Utils();
    }

    /**
     * SHA512 加密
     */
    public static SHA512_Utils SHA512() {
        return new SHA512_Utils();
    }

    /**
     * HmacMD5 加密
     */
    public static HmacMD5_Utils HmacMD5() {
        return new HmacMD5_Utils();
    }

    /**
     * HmacSHA1 加密
     */
    public static HmacSHA1_Utils HmacSHA1() {
        return new HmacSHA1_Utils();
    }

    /**
     * HmacSHA224 加密
     */
    public static HmacSHA224_Utils HmacSHA224() {
        return new HmacSHA224_Utils();
    }

    /**
     * HmacSHA256 加密
     */
    public static HmacSHA256_Utils HmacSHA256() {
        return new HmacSHA256_Utils();
    }

    /**
     * HmacSHA384 加密
     */
    public static HmacSHA384_Utils HmacSHA384() {
        return new HmacSHA384_Utils();
    }

    /**
     * HmacSHA512 加密
     */
    public static HmacSHA512_Utils HmacSHA512() {
        return new HmacSHA512_Utils();
    }

    /**
     * DES 加密
     */
    public static DES_Utils DES() {
        return new DES_Utils();
    }

    /**
     * DES 加密
     */
    public static T_3DES_Utils T_3DES() {
        return new T_3DES_Utils();
    }
}
