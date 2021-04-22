package objects;

public class Person {
    private int id;
    private String name;

    public Person(){
        this.id = -1;
        this.name = null;
    }

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Person(Person person){
        this.id = person.getId();
        this.name = person.getName();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Person clone() {
        return new Person(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" + '\n' +
                "    id='" + id + '\'' + '\n' +
                "    , name='" + name + '\'' + '\n' +
                "}" + '\n';
    }
}
