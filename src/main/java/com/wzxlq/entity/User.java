package com.wzxlq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-04-15 17:07:54
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 425059378499841177L;
    
    private String openId;
    
    private String nickName;
    
    private Integer sex;
    
    private String headImgUrl;


}