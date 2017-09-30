package org.forevery.EncryptUtils.Encrypt.AES;

/**
 * Created by Forevery on 2017/9/30.
 */

public interface AES_BASE {

    public String Encrypt(String data, String password);

    public String Decrypt(String data, String password);

    public String Decrypt(String data, String password, String iv);

    public String Encrypt(String data, String password, String iv);
}
