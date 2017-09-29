package org.forevery.EncryptUtils.Encode.MD5;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static org.forevery.EncryptUtils.Encode.Utils.bytes2HexString;
import static org.forevery.EncryptUtils.Encode.Utils.hashTemplate;

/**
 * Created by Forevery on 2017/9/29.
 */

public class MD5_Utils {

    /**
     * MD5加密
     *
     * @param data 明文字符串
     * @return 16进制密文
     */
    public String Encrypt(final String data) {
        return Encrypt(data.getBytes());
    }

    /**
     * MD5加密
     *
     * @param data 明文字符串
     * @param salt 盐
     * @return 16进制加盐密文
     */
    public String Encrypt(final String data, final String salt) {
        return bytes2HexString(Encrypt_Byte((data + salt).getBytes()));
    }

    /**
     * MD5加密
     *
     * @param data 明文字节数组
     * @return 16进制密文
     */
    public String Encrypt(final byte[] data) {
        return bytes2HexString(Encrypt_Byte(data));
    }

    /**
     * MD5加密
     *
     * @param data 明文字节数组
     * @param salt 盐字节数组
     * @return 16进制加盐密文
     */
    public String Encrypt(final byte[] data, final byte[] salt) {
        if (data == null || salt == null) return null;
        byte[] dataSalt = new byte[data.length + salt.length];
        System.arraycopy(data, 0, dataSalt, 0, data.length);
        System.arraycopy(salt, 0, dataSalt, data.length, salt.length);
        return bytes2HexString(Encrypt_Byte(dataSalt));
    }

    /**
     * MD5加密
     *
     * @param data 明文字节数组
     * @return 密文字节数组
     */
    public byte[] Encrypt_Byte(final byte[] data) {
        return hashTemplate(data, "MD5");
    }

    /**
     * MD5加密文件
     *
     * @param filePath 文件路径
     * @return 文件的16进制密文
     *//*
    public String Encrypt_File(final String filePath) {
        File file = isSpace(filePath) ? null : new File(filePath);
        return Encrypt_File2(file);
    }
*/
    /**
     * MD5加密文件
     *
     * @param filePath 文件路径
     * @return 文件的MD5校验码
     */
    /*public byte[] Encrypt_File(final String filePath) {
        File file = isSpace(filePath) ? null : new File(filePath);
        return Encrypt_File(file);
    }*/

    /**
     * MD5加密文件
     *
     * @param file 文件
     * @return 文件的16进制密文
     */
    public String Encrypt_File2(final File file) {
        return bytes2HexString(Encrypt_File(file));
    }

    /**
     * MD5加密文件
     *
     * @param file 文件
     * @return 文件的MD5校验码
     */
    public byte[] Encrypt_File(final File file) {
        if (file == null) return null;
        FileInputStream fis = null;
        DigestInputStream digestInputStream;
        try {
            fis = new FileInputStream(file);
            MessageDigest md = MessageDigest.getInstance("MD5");
            digestInputStream = new DigestInputStream(fis, md);
            byte[] buffer = new byte[256 * 1024];
            while (true) {
                if (!(digestInputStream.read(buffer) > 0)) break;
            }
            md = digestInputStream.getMessageDigest();
            return md.digest();
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            closeIO(fis);
        }
    }

    private void closeIO(final Closeable... closeables) {
        if (closeables == null) return;
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
