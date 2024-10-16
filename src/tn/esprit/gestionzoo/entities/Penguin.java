package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth;
    public Penguin(){};
    public Penguin (String family ,String name , int age ,boolean isMammal,String habitat, float swimmingDepth)
    {
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth=swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString() + ", Panguin [swimmingDepth=" + swimmingDepth+ "]";
    }
    public void swim() {
        System.out.println("This panguin is swimming.");
    }
}
