package estudos.dio.galaxy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Planeta {
    @Id
    private String id;

    @Column(name = "EnglishName", nullable=true)
    private String englishName;

    @Column(name = "isPlanet", nullable = false)
    @JsonProperty("isPlanet")
    private boolean isPlanet;

    // TODO: é necessário dar um jeito para que o Mass funcione da forma correta
    // @Column(name = "mass", nullable = false)
    // private double mass [] = new double[2];

    @Column(name = "gravity", nullable = false)
    private double gravity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public boolean isPlanet() {
        return isPlanet;
    }

    public void setPlanet(boolean isPlanet) {
        this.isPlanet = isPlanet;
    }

    // public double[] getMass() {
    //     return mass;
    // }

    // public void setMass(double[] mass) {
    //     this.mass = mass;
    // }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    
}
