package domain;

public class Page {

    public enum Status{
        HIDDEN,PUBLISHED;
    }

    private int id;

    private String titre;

    private String URI;

    private String contenue;

    private User autheur;

    private Status status;


    public Page(int id,String titre,String URI,String contenue,User autheur,Status status){
        this.id = id;
        this.autheur = autheur;
        this.URI = URI;
        this.contenue = contenue;
        this.autheur = autheur;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getContenue() {
        return contenue;
    }

    public String getTitre() {
        return titre;
    }

    public String getURI() {
        return URI;
    }

    public User getAutheur() {
        return autheur;
    }

}
