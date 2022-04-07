package Commands;

public abstract class BigCommand implements Command{
    private String name;
    private String description;

    public BigCommand(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName(){return name;}
    public String getDescription(){ return description;}
    @Override
    public String toString() {
        return name + " (" + description + ")";
    };

    @Override
    public int hashCode() {
        return name.hashCode() + description.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        BigCommand other = (BigCommand) obj;
        return name.equals(other.name) && description.equals(other.description);
    }
}
