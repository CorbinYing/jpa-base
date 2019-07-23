package org.corbin.jpabase.server;

import org.corbin.jpabase.base.service.BaseService;
import org.corbin.jpabase.entity.UserInfo;
import org.corbin.jpabase.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author yin
 * @date 2019/06/15
 */
@Service
public class UserInfoService extends BaseService<UserInfo, Long> {
    @Autowired
    private UserInfoRepository userInfoRepository;


//    public void Test1(){
//        List<UserInfo> list= userInfoRepository.listBySQL("select * from user_info");
//
//    }


    public void insertUser() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(new Random().nextLong());
        userInfo.setName("yin");
        userInfoRepository.save(userInfo);
        List<UserInfo> list = userInfoRepository.queryArrayListByHql("select a from UserInfo a");
//       Object[] obj1=list.get(0);
//        for (Object s:obj1
//             ) {
//            System.out.println(s);
//
//        }
//       list.forEach(System.out::println);

        //    list = userInfoRepository.findAll();
        list.forEach(System.out::println);
    }

    public void getef() {
        //   UserInfo u= queryOneByHql("select a.name from UserInfo a where a.id=8477759323643237963");
      //  List<Map> u = userInfoRepository.test();
        UserInfo u=queryBySql("select a.name from user_info a where a.id=8477759323643237963",UserInfo.class);
    //    u.forEach(o->System.out.println(o.entrySet()));
        System.out.println(u);
        //return u;
    }
}
