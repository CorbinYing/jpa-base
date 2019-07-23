package org.corbin.jpabase.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.corbin.jpabase.entity.UserInfo;
import org.corbin.jpabase.server.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yin
 * @date 2019/06/15
 */
@Controller
@RequestMapping("/test")
public class Test {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/insert/user")
    public void testCreateTable() {
        //  userInfoService.testCommonService();
        userInfoService.insertUser();
        UserInfo u = userInfoService.findByPK(5000937294228808804L);
        System.out.println(u);

    }


    @GetMapping("/1")
    public void sdfyu() {
        userInfoService.getef();
    }
}
