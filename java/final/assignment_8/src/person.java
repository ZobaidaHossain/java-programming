


public abstract class person {
   protected String name;
   protected String age;

    public person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" + "name=" + name + ", age=" + age + '}';
    }
    
   public abstract void displaypersoninfo();
}

