package com.design.chain;

/**
 * 大小处理器
 *
 * @author peng
 * @since 10 十一月 2018
 */
public class SizeHandler extends Handler {

    /**
     * 构造器
     *
     * @param name
     */
    public SizeHandler(String name) {
        super(name);
    }

    @Override
    protected boolean process(HandlerEntry handlerEntry) {
        return 0 < handlerEntry.getNumber() && handlerEntry.getNumber() < 100;
    }
}
