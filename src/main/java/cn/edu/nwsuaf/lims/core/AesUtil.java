package cn.edu.nwsuaf.lims.core;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import static cn.edu.nwsuaf.lims.core.ProjectConstant.PUB_KEY;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

/*****************************************************
 * AES加密解密工具
 ****************************************************/

public class AesUtil {

    private static final Logger logger = Logger.getLogger(AesUtil.class); //log日志

    private static final String ALGORITHM = "AES/ECB/PKCS5Padding";    //"算法/模式/补码方式"

    /*****************************************************
     * AES加密
     * @param content 加密内容
     * @return 加密密文
     ****************************************************/

    public static String enCode(String content) {
        if (PUB_KEY == null || "".equals(PUB_KEY)) {
            logger.info("key为空！");
            return null;
        }
        if (PUB_KEY.length() != 16) {
            logger.info("key长度不是16位！");
            return null;
        }
        try {
            byte[] raw = PUB_KEY.getBytes();  //获得密码的字节数组
            SecretKeySpec skey = new SecretKeySpec(raw, "AES"); //根据密码生成AES密钥
            Cipher cipher = Cipher.getInstance(ALGORITHM);  //根据指定算法ALGORITHM自成密码器
            cipher.init(Cipher.ENCRYPT_MODE, skey); //初始化密码器，第一个参数为加密(ENCRYPT_MODE)或者解密(DECRYPT_MODE)操作，第二个参数为生成的AES密钥
            byte [] byte_content = content.getBytes("utf-8"); //获取加密内容的字节数组(设置为utf-8)不然内容中如果有中文和英文混合中文就会解密为乱码
            byte [] encode_content = cipher.doFinal(byte_content); //密码器加密数据
            return Base64.encodeBase64String(encode_content); //将加密后的数据转换为字符串返回
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /*****************************************************
     * AES解密
     * @param content 加密密文
     * @return 解密明文
     ****************************************************/

    public static String deCode(String content) {
        if (PUB_KEY == null || "".equals(PUB_KEY)) {
            logger.info("key为空！");
            return null;
        }
        if (PUB_KEY.length() != 16) {
            logger.info("key长度不是16位！");
            return null;
        }
        try {
            byte[] raw = PUB_KEY.getBytes();  //获得密码的字节数组
            SecretKeySpec skey = new SecretKeySpec(raw, "AES"); //根据密码生成AES密钥
            Cipher cipher = Cipher.getInstance(ALGORITHM);  //根据指定算法ALGORITHM自成密码器
            cipher.init(Cipher.DECRYPT_MODE, skey); //初始化密码器，第一个参数为加密(ENCRYPT_MODE)或者解密(DECRYPT_MODE)操作，第二个参数为生成的AES密钥
            byte [] encode_content = Base64.decodeBase64(content); //把密文字符串转回密文字节数组
            byte [] byte_content = cipher.doFinal(encode_content); //密码器解密数据
            return new String(byte_content,"utf-8"); //将解密后的数据转换为字符串返回
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /*****************************************************
     * AES加密解密测试
     * @param args
     * @return
     ****************************************************/


}
