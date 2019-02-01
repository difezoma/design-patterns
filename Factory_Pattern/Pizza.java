public abstract class Pizza{

    String description = "Unknown Description";
    String dough = "Unknown Dough";

    public void bake(){
        System.out.println("Baking Pizza");
    }

    public void cut(){
        System.out.println("Cutting Pizza in slices");
    }

    public void box(){
        System.out.println("Boxing Pizza");
    }

    public void getDescription(){
        System.out.println(description+" "+dough);
    }

}