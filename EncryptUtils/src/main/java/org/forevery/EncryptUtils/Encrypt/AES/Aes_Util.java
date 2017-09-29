package org.forevery.EncryptUtils.Encrypt.AES;

/**
 * Created by Forevery on 2017/5/21.
 */

import org.forevery.EncryptUtils.Encrypt.AES.CBC.CBC_Ut;
import org.forevery.EncryptUtils.Encrypt.AES.ECB.ECB_Ut;

/**
 * AES加密解密算法
 *
 *
 */
public class Aes_Util {

    public CBC_Ut CBC() {
        return new CBC_Ut();
    }

    public ECB_Ut ECB() {
        return new ECB_Ut();
    }

}