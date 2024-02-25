package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "planet")
@Entity
public class PlanetEntity {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;

    public PlanetEntity() {

    }

    public PlanetEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
