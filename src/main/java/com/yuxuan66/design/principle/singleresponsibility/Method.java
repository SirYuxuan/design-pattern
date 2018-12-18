package com.yuxuan66.design.principle.singleresponsibility;

/**
 * @author Sir丶雨轩
 * @date 2018/12/18 16:08
 */
public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "yuxuan";
        address = "jinan";
    }
    private void updateUserInfo(String userName, String... properties) {
        userName = "yuxuan";
       // address = "jinan";
    }
    private void updateUserName(String userName) {
        userName = "yuxuan";
    }
    private void updateUserAddress(String address) {
        address = "jinan";
    }

    private void updateUserInfo(String userName, String address,boolean bool) {
        if(bool){
            //todo something1
        }else{
            //todo something2
        }
        userName = "yuxuan";
        address = "jinan";
    }
}
