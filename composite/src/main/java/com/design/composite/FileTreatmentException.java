package com.design.composite;

/**
 * 自定义异常
 *
 * @author :peng
 * @version :v1.0
 */
public class FileTreatmentException extends RuntimeException {

    public FileTreatmentException() {

    }

    public FileTreatmentException(String msg) {
        super(msg);
    }

}
