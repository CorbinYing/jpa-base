package org.corbin.jpabase.base.dao;

import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * @author yin
 * @date 2019/06/21
 *
 * 自定义查询方法直接写在BaseRepository 由于继承了jpa的自定义接口，导致会有命名查询的问题，
 * 单独写一个实现类，避免此问题
 */
@NoRepositoryBean
public interface CustomRepository {
    /**
     * return a union domain which found by hql
     *
     * @param hql
     * @return
     */
     <T>T queryOneByHql(String hql,Class<T> clazz) ;

    /**
     * find list result with hql
     *
     * @param hql
     * @return
     */
    <T> List<T> queryArrayListByHql(String hql, Class<T> clazz);
}
