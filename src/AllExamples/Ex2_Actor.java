package AllExamples;

public class Ex2_Actor {

    //Instance Variables
    public String role;
    public String name;
    public int sales;
    public boolean isPro;

    //Constructor Methods
    public Ex2_Actor(String r, String n){
        role = r;
        name = n;
        sales = 0;
        isPro = false;
    }

    public Ex2_Actor(String r, String n, boolean p){
        role = r;
        name = n;
        sales = 0;
        isPro = p;
    }

    public String toString(){
        return role + "  "+ name +"  "+sales+"  "+isPro;
    }

    public void printMe(){
        System.out.println(role + "  "+ name);
        System.out.println("Ticket sold: "+sales+" Pro: "+isPro);
    }

    public void sellTicks(int n){
        sales += n;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public boolean isPro() {
        return isPro;
    }

    public void setPro(boolean pro) {
        isPro = pro;
    }
}
