package org.corbin.jpabase.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    @Transient
    private List<String> child;
}
