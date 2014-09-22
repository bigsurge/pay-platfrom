/**
 * 
 */
package com.isoftstone.pay.utils;

import java.util.UUID;



/**
 * @author lllianga
 * 2014年9月18日上午9:27:36
 */
public class UUIDGenerator {

    public static String getUUID(){
       return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
