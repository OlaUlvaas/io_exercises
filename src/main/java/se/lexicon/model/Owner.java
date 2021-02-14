package se.lexicon.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Owner implements Serializable {
    // ownerId, name, birthdate
    private UUID ownerId;
    private String name;
    private String birthDate;

    public Owner() {
        this.ownerId = UUID.randomUUID();
    }

    public Owner(String name, String birthDate) {
        this.ownerId = UUID.randomUUID();
        this.name = name;
        this.birthDate = birthDate;
    }

    public UUID getOwnerId() {
        return ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(ownerId, owner.ownerId) && Objects.equals(name, owner.name) && Objects.equals(birthDate, owner.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, name, birthDate);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ownerId=" + ownerId +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
