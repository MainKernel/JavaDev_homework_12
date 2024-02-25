package entity;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "client")
@Entity
public class ClientEntity {
    @Id
    @SequenceGenerator(name = "client_seq", sequenceName = "client_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "client_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public ClientEntity() {
    }

    public ClientEntity(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
