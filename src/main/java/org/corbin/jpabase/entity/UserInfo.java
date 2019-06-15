package org.corbin.jpabase.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author yin
 * @date 2019/06/15
 */
@Entity
@Data
@Table(name = "user_info")
public class UserInfo implements Serializable {
    @Id
//    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
