package com.payment.integration.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Credentials {
    private String code;
    private String key;
    private String password;
    private String username;
    private String signature;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "'credentials':{" +
                "'code':'" + code + '\'' +
                ", 'key':'" + key + '\'' +
                ", 'password':'" + password + '\'' +
                ", 'username':'" + username + '\'' +
                ", 'signature':'" + signature + '\'' +
                '}';
    }
}
