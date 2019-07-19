package main.java.fireDepartment;

class Firefighter {

    private String name;

    Firefighter(String name) {
        this.name = name;
    }

    void fightFire(){
        System.out.println(name + ": is ready to work");
    }
}
