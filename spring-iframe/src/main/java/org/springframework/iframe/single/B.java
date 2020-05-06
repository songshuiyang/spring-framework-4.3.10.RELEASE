package org.springframework.iframe.single;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author songsy
 * @date 2020/5/6 12:09
 */
@Component
public class B {


    @Autowired
    private A a;

    private String name;


    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
