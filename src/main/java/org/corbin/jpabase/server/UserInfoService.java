package org.corbin.jpabase.server;

import org.corbin.jpabase.entity.UserInfo;
import org.corbin.jpabase.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @author yin
 * @date 2019/06/15
 */
@Service
public class UserInfoService{
    @Autowired
    private UserInfoRepository userInfoRepository;



//    public void Test1(){
//        List<UserInfo> list= userInfoRepository.listBySQL("select * from user_info");
//
//    }


    public void insertUser(){
        UserInfo userInfo=new UserInfo();
        userInfo.setId(new Random().nextLong());
        userInfo.setName("yin");
        userInfoRepository.save(userInfo);
        userInfoRepository.test();
       List<Object[]> list= userInfoRepository.sqlArrayList("select * from user_info");
       Object[] obj1=list.get(0);
        for (Object s:obj1
             ) {
            System.out.println(s);

        }
       list.forEach(System.out::println);

//       list=userInfoRepository.findAll();
//       list.forEach(System.out::println);

    }
}