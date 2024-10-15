package tn.esprit.gestionzoo.entities ;
public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;
    public Animal(){};
    public Animal (String family ,String name ,int age , boolean isMammal)
    {this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;}
    public int getAge() {
        return age;
    }
    private boolean isAgeValid(int age) {
        return age >= 0;
    }
    public void setAge(int age) {
        if (isAgeValid(age)) {
            this.age = age;
        } else {
            System.out.println("Erreur : L'âge ne peut pas être négatif.");
        }
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }



    public String getDetails() {
        return "Animal: " + name + ", Family: " + family + ", Age: " + age + ", Mammal: " + isMammal;
    }
    @Override
    public String toString() {
        return "Animal [Family=" + family +
                ", Name=" + name +
                ", Age=" + age +
                ", Mammal=" + isMammal + "]";
    }

}
