class Person {
    public String cname;
    private int cage;

    void getName(String name, int age) {
        this.cname = name;
        this.cage = age;
    }

    void sayHello() {
        System.out.println("Hello my name is " + cname + " and I am " + cage + " years old. I am a Java developer.");
    }
}

class heloworld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Person obj=new Person();
        Person obj1=new Person();
        
    
        obj.getName("Suba", 23);
        obj1.getName("Dhanu", 25);
        obj.sayHello();
    
    }
}