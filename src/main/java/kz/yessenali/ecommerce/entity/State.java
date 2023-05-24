package kz.yessenali.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name="state")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;
}
