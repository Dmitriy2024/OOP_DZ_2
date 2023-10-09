 public class Cat {
     protected    String  name;
     protected  int appetite;
     protected boolean satiety;

     public Cat(String name, int appetite, boolean satiety) {
         this.name = name;
         this.appetite = appetite;
         this.satiety =satiety;
     }

     public int getAppetite() {return appetite;}
     public boolean getSatite() {return satiety;}
     public String getName() {return name;}


     public void  eat(int food){
         if (appetite <= food) {

          this.satiety = true;
         }

         else {
             this.satiety = false;
         }

     }

 }




