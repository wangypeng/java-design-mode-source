package com.design.adapter.interfaces;

/**
 * com.design.adapter.interfaces
 *
 * @author :yunpeng.wang
 * @version :v1.0
 * @describe :des
 * @date :2018/8/12,上午11:32
 */
public class InterfaceAdapter extends AbstractInterfaceAdapteeInterface {

    @Override
    public void methodA() {
        System.out.println("This is interface's adaptee method A");
    }

    @Override
    public void methodC() {
        System.out.println("This is interface's adaptee method C");
    }
}
