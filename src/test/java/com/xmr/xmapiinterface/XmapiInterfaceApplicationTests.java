package com.xmr.xmapiinterface;


import com.xmr.xmapicilentsdk.client.XmApiClient;
import com.xmr.xmapicilentsdk.model.User;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.xmr.xmapicilentsdk.XmApiClientConfig;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(XmApiClientConfig.class)
class XmapiInterfaceApplicationTests {

   @Resource
   private XmApiClient xmApiClient;
    @Test
    void contextLoads() {
        String xm = xmApiClient.getNameByGet("xm");
        System.out.println(xm);
        User user = new User();
        user.setUsername("xm");
        String usernmameByPost = xmApiClient.getUsernameByPost(user);
        System.out.println(xm);
        System.out.println(usernmameByPost);
    }

}
