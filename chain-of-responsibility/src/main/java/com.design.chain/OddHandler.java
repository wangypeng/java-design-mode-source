package com.design.chain;

/**
 * 奇数处理器
 *
 * @author yunpeng.wang
 * @since 10 十一月 2018
 */
public class OddHandler extends Handler {

    /**
     * 构造器
     *
     * @param name
     */
    public OddHandler(String name) {
        super(name);
    }

    @Override
    protected boolean process(HandlerEntry handlerEntry) {
        return handlerEntry.getNumber() % 2 == 1;
    }
}
