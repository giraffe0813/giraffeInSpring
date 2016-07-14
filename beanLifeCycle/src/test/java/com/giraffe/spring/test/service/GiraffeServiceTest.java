package com.giraffe.spring.test.service;

import com.giraffe.spring.service.GiraffeService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yemengying on 16/7/14.
 */
public class GiraffeServiceTest {

    @Test
    public void testBeanLifeCycle(){

        System.out.println("Spring容器初始化");
        System.out.println("=====================================");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

        System.out.println("Spring容器初始化完毕");
        System.out.println("=====================================");

        System.out.println("从容器中获取Bean");

        GiraffeService service = context.getBean("giraffeService", GiraffeService.class);

        System.out.println("giraffe Name="+service.getName());
        System.out.println("=====================================");

        context.close();

        System.out.println("Spring容器关闭");

    }

}
