package myProj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "usrs_card")
public class UserCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable=false)
    private int id;

    @Column(name = "num_of_stars")
    private int numStar;

    @Column(name = "description")
    private String description;

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_card_usrs")
    private User user;

    @Override
    public String toString() {
        return "UserCard{" +
                "id=" + id +
                ", numStar=" + numStar +
                ", description='" + description + '\'' +
             //   ", user=" + user +
                '}';
    }
}
