package Domain;

import javax.persistence.*;

@Entity
@Table(name = "journalist")
public class Journalist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int idJournalist;
    @Column(name = "Name")
    private String name;

    public Journalist(){
    }

    public Journalist(Integer idJournalist, String name) {
        this.idJournalist = idJournalist;
        this.name = name;
    }

    public int getIdJournalist() {
        return idJournalist;
    }

    public void setIdJournalist(int idJournalist) {
        this.idJournalist = idJournalist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Journaliste{" +
                "id=" + idJournalist +
                ", name='" + name + '\'' +
                '}';
    }
}
