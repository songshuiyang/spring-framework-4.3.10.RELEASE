package org.springframework.iframe.single;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author songsy
 * @date 2020/5/6 12:09
 */
@Component
public class A {

    @Autowired
    private B b;

    private String name;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
