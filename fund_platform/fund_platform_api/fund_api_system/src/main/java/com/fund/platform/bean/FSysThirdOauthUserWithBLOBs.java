package com.fund.platform.bean;
/**
 * create class FSysThirdOauthUserWithBLOBs.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public class FSysThirdOauthUserWithBLOBs extends FSysThirdOauthUser {
    private String token;

    private String rawUserInfo;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getRawUserInfo() {
        return rawUserInfo;
    }

    public void setRawUserInfo(String rawUserInfo) {
        this.rawUserInfo = rawUserInfo == null ? null : rawUserInfo.trim();
    }
}