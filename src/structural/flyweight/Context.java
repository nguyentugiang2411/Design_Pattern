package structural.flyweight;

public class Context {
    private String id;
    private int star;

    public Context(String id, int star) {
        this.id = id;
        this.star = star;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

}
