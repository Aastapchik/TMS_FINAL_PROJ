package myProj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "usrs_order")
public class UserOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable=false)
    private int id;

    @Column(name = "name_of_order")
    private String nameOrder;

    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name="fk_usrs_order")
    private User user;


    @Override
    public String toString() {
        return "UserOrder{" +
                "id=" + id +
                ", nameOrder='" + nameOrder + '\'' +
                ", user=" + user +
                '}';
    }
}
