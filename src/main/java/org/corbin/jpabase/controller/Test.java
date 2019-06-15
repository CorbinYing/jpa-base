package org.corbin.jpabase.controller;

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
    public void testCreateTable(){
      //  userInfoService.testCommonService();
        userInfoService.insertUser();
    //    userInfoService.findByPk(123L);

    }
}
