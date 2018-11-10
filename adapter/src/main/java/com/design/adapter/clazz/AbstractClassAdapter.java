package com.design.adapter.clazz;

/**
 * com.design.adapter.clazz
 *
 * @author :peng
 * @version :v1.0
 * @describe :des
 * @date :2018/8/12,上午11:04
 */
public class AbstractClassAdapter extends AbstractClassAdaptee implements ClassTargetInterface {

    @Override
    public void invokeMethod() {
        super.adapteeMethod();
    }
}
