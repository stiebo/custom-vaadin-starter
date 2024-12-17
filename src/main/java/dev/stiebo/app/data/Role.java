package dev.stiebo.app.data;

import dev.stiebo.app.configuration.RoleName;
import jakarta.persistence.*;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Entity
@Table(name = "user_role")
public class Role extends AbstractEntity {

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private RoleName name;

    public RoleName getName() {
        return name;
    }

    public void setName(RoleName name) {
        this.name = name;
    }
}
