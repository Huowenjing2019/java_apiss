package com.tedu.cn.api.ex;

import java.io.PrintStream;
import java.io.PrintWriter;

public class PasswordException extends RuntimeException {
    public PasswordException() {
        super();
    }

    public PasswordException(String message) {
        super(message);
    }

    public PasswordException(int type, String message) {
        switch(type){
            case 1:
                System.out.println(message);
                break;
            case 2:
                System.out.println(message);
                break;
            case 3:
                System.out.println(message);
                break;
        }
    }

    public PasswordException(Throwable cause) {
        super(cause);
    }

    protected PasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
