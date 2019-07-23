package org.corbin.jpabase.repository;

import org.corbin.jpabase.base.dao.BaseRepository;
import org.corbin.jpabase.entity.UserInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author yin
 * @date 2019/06/15
 */
@Repository
public interface UserInfoRepository extends BaseRepository<UserInfo,Long> {

    @Query(value = "select a.name,a.id from user_info a where a.id like '%%' ",nativeQuery = true)
    List<Map> test();
}
