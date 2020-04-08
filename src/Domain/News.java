package Domain;

import java.util.Date;
import java.util.List;


public class News {

    private int idNews;


    private String title;
    private String content;
    private Date dateOfPoste;
    private int idJournalist;
    private List<String> tags;

    public News(){
    }

    public int getIdNews() {
        return idNews;
    }

    public void setIdNews(int idNews) {
        this.idNews = idNews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateOfPoste() {
        return dateOfPoste;
    }

    public void setDateOfPoste(Date dateOfPoste) {
        this.dateOfPoste = dateOfPoste;
    }

    public Integer getIdJournalist() {
        return idJournalist;
    }

    public void setIdJournalist(Integer idJournalist) {
        this.idJournalist = idJournalist;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + idNews +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", DateOfPoste='" + dateOfPoste + '\'' +
                ", journalisteId='" + idJournalist + '\'' +
                '}';
    }
}
