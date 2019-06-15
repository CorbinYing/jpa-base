package org.corbin.jpabase.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author yin
 * @date 2019/06/15
 */
@NoRepositoryBean
public interface BaseRepository<T,ID extends Serializable>
        extends JpaRepository<T,ID>,
        JpaSpecificationExecutor<T>,
        PagingAndSortingRepository<T,ID> {

    void test();

    /**
     * 查询多个属性
     * 返回List<Object[]>数组形式的List，数组中内容按照查询字段先后
     *
     * @param sql 原生SQL语句
     * @return
     */
    List<Object[]> sqlArrayList(String sql);
    List<T> sqlArrayList2(String sql);
}
