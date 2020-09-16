package com.wzxlq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王照轩
 * @date 2020/5/6 - 9:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RankInfo {
    /**
     * rank 排名
     * wordCount 单词总数
     * dailyCount 今日总数
     * isTixing 是否提醒背单词
     */
    private Long rank;
    private int wordCount;
    private int dailyCount;
    private int isTixing;
    private int linkSignInCount;
}
