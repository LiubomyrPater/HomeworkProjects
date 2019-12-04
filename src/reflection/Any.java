package reflection;

public class Any {

    private String name;
    private Integer count;
    private Boolean is;

    public Any() {
    }

    public Any(String name, Integer count, Boolean is) {
        this.name = name;
        this.count = count;
        this.is = is;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    public Boolean getIs() {
        return is;
    }

    public void setName(String name) {
        this.name = name;
    }
}
