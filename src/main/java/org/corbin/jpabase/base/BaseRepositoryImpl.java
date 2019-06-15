package org.corbin.jpabase.base;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

/**
 * @author yin
 * @date 2019/06/15
 */
public class BaseRepositoryImpl<T, ID extends Serializable>
        extends SimpleJpaRepository<T, ID>
        implements BaseRepository<T, ID> {
    /**
     * 父类没有不带参数的构造方法，这里手动构造父类
     */
    private final EntityManager em;
    private Class<T> domainClass;


    public BaseRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.domainClass=domainClass;
        this.em = em;
    }



    @Override
    public void test() {
        System.out.println("_____________________________________________________________________________________________");
    }

    //通过EntityManager来完成查询
/*    @Override
    public  List<T> listBySQL(String sql) {
        return entityManager.createNativeQuery(sql).getResultList();
    }*/


    @Override
    public List<Object[]> sqlArrayList(String sql) {
        Query query = em.createNativeQuery(sql);
        List<Object[]> list = query.getResultList();
        em.close();
        return list;
    }

    @Override
    public List<T> sqlArrayList2(String sql) {
        Query query = em.createNativeQuery(sql);
        List<Object[]> list = query.getResultList();
        query.
        em.close();
        return list;
    }
}
