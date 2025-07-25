package estudos.dio.galaxy.model;

import org.hibernate.annotations.DialectOverride.GeneratedColumn;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class FormaDeVida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormaDeVida;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "idade", nullable = true)
    private int idade;

    @Column(name = "especie", nullable = true)
    private String especie;

    @Column(name = "isInteligent", nullable = false)
    private boolean isInteligent;

    @Column(name = "planeta", nullable = false)
    private String planeta;

    public Long getIdFormaDeVida() {
        return idFormaDeVida;
    }

    public void setIdFormaDeVida(Long id) {
        this.idFormaDeVida = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isInteligent() {
        return isInteligent;
    }

    public void setInteligent(boolean isInteligent) {
        this.isInteligent = isInteligent;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    

    

    
}
