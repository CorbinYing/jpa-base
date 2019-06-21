package org.corbin.jpabase.base.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author yin
 * @date 2019/06/21
 */
@Component
public class CustomRepositoryImpl implements CustomRepository {
    @Autowired
    EntityManager entityManager;

    /**
     * return a union domain which found by hql
     *
     * @param hql
     * @return
     */
    @Override
    public <T> T queryOneByHql(String hql, Class<T> clazz) {
        return (T) entityManager.createQuery(hql, clazz);
    }

    /**
     * find list result with hql
     *
     * @param hql
     * @return
     */
    @Override
    public <T> List<T> queryArrayListByHql(String hql, Class<T> clazz) {
        return entityManager.createQuery(hql, clazz).getResultList();
    }

}
