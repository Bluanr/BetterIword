package com.wzxlq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王照轩
 * @date 2020/5/1 - 11:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class wxUser {
    /**
     * openid 微信openid
     * nickname 微信名
     * sex 性别
     * province 省份
     * city 城市
     */
    private String openid;
    private String nickname;
    private String sex;
    private String province;
    private String city;
    private String country;
    private String headimgurl;
    private String[] privilege;
    private String unionid;

}
