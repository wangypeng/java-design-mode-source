package com.design.adapter;

import com.design.adapter.clazz.AbstractClassAdapter;
import com.design.adapter.clazz.ClassTargetInterface;
import com.design.adapter.interfaces.InterfaceAdapter;
import com.design.adapter.interfaces.InterfaceTargetInterface;
import com.design.adapter.objects.ObjectAdaptee;
import com.design.adapter.objects.ObjectAdapter;
import com.design.adapter.objects.ObjectTargetInterface;

/**
 * adapter--client
 *
 * @author :yunpeng.wang
 * @version :v1.0
 * @describe :des
 * @date :2018/8/12,上午10:54
 */
public class Client {

    public static void main(String[] args) {

        // class's adapter
        ClassTargetInterface classTargetInterface = new AbstractClassAdapter();
        classTargetInterface.invokeMethod();

        // object's adapter
        ObjectAdaptee objectAdaptee = new ObjectAdaptee();
        ObjectTargetInterface objectTargetInterface = new ObjectAdapter(objectAdaptee);
        objectTargetInterface.invokeMethod();

        // interface's adapter
        InterfaceTargetInterface interfaceTargetInterface = new InterfaceAdapter();
        interfaceTargetInterface.methodA();
        interfaceTargetInterface.methodC();

    }
}
