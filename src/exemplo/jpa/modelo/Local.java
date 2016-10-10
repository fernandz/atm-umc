package exemplo.jpa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "local_seq", sequenceName = "local_seq", allocationSize = 1,
                   initialValue = 1)
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "local_seq")
    private Long id;
    private String predio;
    private String sala;
    private int capacidade;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the predio
     */
    public String getPredio() {
        return predio;
    }

    /**
     * @param predio the predio to set
     */
    public void setPredio(String predio) {
        this.predio = predio;
    }

    /**
     * @return the sala
     */
    public String getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(String sala) {
        this.sala = sala;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
}
