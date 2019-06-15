//package org.corbin.jpabase.base;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import java.io.Serializable;
//import java.util.Optional;
//
///**
// * @author yin
// * @date 2019/06/15
// */
//@Service
//public abstract class BaseService<T, ID extends Serializable> {
//    @Autowired
//    private BaseRepository baseRepository;
//
//    public void testCommonService() {
//        System.out.println("23333333333333333333");
//    }
//
//    public T findByPk(ID id) {
//        Optional<T> optional=baseRepository.findById(id);
//        return optional.orElse(null);
//    }
//
//
//}
