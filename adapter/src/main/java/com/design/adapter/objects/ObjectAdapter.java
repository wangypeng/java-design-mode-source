package com.design.adapter.objects;

/**
 * object's adapter
 *
 * @author :yunpeng.wang
 * @version :v1.0
 * @describe :des
 * @date :2018/8/12,上午11:09
 */
public class ObjectAdapter implements ObjectTargetInterface {

    private ObjectAdaptee objectAdaptee;

    public ObjectAdapter(ObjectAdaptee objectAdaptee) {
        this.objectAdaptee = objectAdaptee;
    }

    @Override
    public void invokeMethod() {
        this.objectAdaptee.apateeMethod();
    }
}
