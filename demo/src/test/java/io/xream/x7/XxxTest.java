package io.xream.x7;

import io.xream.x7.demo.Cat;
import io.xream.x7.demo.controller.XxxController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import x7.core.util.HttpClientUtil;
import x7.core.web.ViewEntity;


@Component
public class XxxTest {


    @Autowired
    private XxxController controller;

    public  void refreshByCondition() {

        Cat cat = new Cat();

        cat.setDogId(2323);
        cat.setId(122);

        ViewEntity ve = this.controller.refreshByCondition(cat);

        System.out.println("\n______Result: " + ve);

    }
}
