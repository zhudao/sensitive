package com.github.houbb.sensitive.core.api.strategory;

import com.github.houbb.sensitive.api.IContext;

/**
 * 邮箱脱敏策略
 * 脱敏规则：
 * 保留前三位，中间隐藏4位。其他正常显示
 * @author binbin.hou
 * date 2019/1/2
 */
public class StrategyEmail extends AbstractStringStrategy {

    @Override
    protected int getBeforeMaskLen(Object original, IContext context, char[] chars) {
        return 2;
    }

    @Override
    protected int getAfterMaskLen(Object original, IContext context, char[] chars) {
        return 4;
    }

}
