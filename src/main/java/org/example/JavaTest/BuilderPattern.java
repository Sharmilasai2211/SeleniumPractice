package org.example.JavaTest;

class Builder{

    private String name;
    private int id;
    int age;

    private Builder(Build build){
        this.name = build.name;
        this.id = build.id;
        this.age = build.age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    static class Build{
        private String name;
        private int age, id;

        public Build setName(String name) {
            this.name = name;
            return this;
        }

        public Build setAge(int age) {
            this.age = age;
            return this;
        }

        public Build setId(int id) {
            this.id = id;
            return this;
        }

        public Builder build(){
            return new Builder(this);
        }
    }

}

public class BuilderPattern {

    public static void main(String[] args) {

        Builder b = new Builder.Build().setAge(5).build();

        System.out.println(b.getAge());
    }
}
