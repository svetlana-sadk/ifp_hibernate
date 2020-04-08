package Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Tag {
   // @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTag;

    private String name;

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int idTag) {
        this.idTag = idTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + idTag +
                ", name='" + name + '\'' +
                '}';
    }
}
