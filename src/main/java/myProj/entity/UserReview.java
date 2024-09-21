package myProj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "usrs_review")
public class UserReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable=false)
    private int id;

    @Column(name = "review")
    private String review;

    @Column(name = "grade")
    private int grade;

    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="fk_review_usrs")
    private User user;

    @Override
    public String toString() {
        return "UserReview{" +
                "id=" + id +
                ", review='" + review + '\'' +
                ", grade=" + grade +
                ", user=" + user +
                '}';
    }
}
