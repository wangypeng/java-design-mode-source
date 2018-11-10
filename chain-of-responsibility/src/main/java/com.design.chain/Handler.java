package com.design.chain;

import java.util.Objects;

/**
 * abstract class handler
 *
 * @author peng
 * @since 10 十一月 2018
 */
public abstract class Handler {
    /**
     * name
     */
    private String name;
    /**
     * next handler in chain
     */
    private Handler nextHandler;

    public Handler(String name) {
        this.name = name;
    }

    public Handler setNext(Handler next) {
        this.nextHandler = next;
        return this;
    }

    /**
     * 处理方法
     *
     * @param handlerEntry
     */
    public final void excute(HandlerEntry handlerEntry) {
        if (process(handlerEntry)) {
            done(handlerEntry);
            return;
        } else if (Objects.nonNull(nextHandler)) {
            nextHandler.excute(handlerEntry);
        } else {
            fail(handlerEntry);
        }
    }

    /**
     * 子类实现该方法，主要实现业务方法
     *
     * @param handlerEntry
     * @return
     */
    protected abstract boolean process(HandlerEntry handlerEntry);

    /**
     * 处理结束方法
     *
     * @param handlerEntry
     */
    private void done(HandlerEntry handlerEntry) {
        System.out.println("chain done , number : " + handlerEntry.getNumber());
    }

    /**
     * 处理失败方法
     *
     * @param handlerEntry
     */
    private void fail(HandlerEntry handlerEntry) {
        System.out.println("chain process fail , nulber : " + handlerEntry.getNumber());

    }

}
