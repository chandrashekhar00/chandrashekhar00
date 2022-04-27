import java.sql.SQLOutput;
import java.util.Scanner;

public class Itemtype {
    private String name;
    private Double costPerDay;
    private Double deposit;
    Itemtype(){
          this.deposit = 10000.50;
    }
    public void setname(String name){
          this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setcostPerDay(Double costPerDay){
        this.costPerDay = costPerDay;
    }
    public Double getcostPerDay(){
        return costPerDay;

    }
    public void setdeposit(Double deposit){
        this.deposit = deposit;
    }
    public Double getdeposit(){
        return deposit;

    }


    public void display(){
                Itemtype a = new Itemtype();
                System.out.println("Item Type Details");
                System.out.println("Name: "+ getname());
                System.out.println("cost Per day :"+ getcostPerDay());
                System.out.println("Deposit: "+ getdeposit());
            }
            public static void main(String[] args){
                Itemtype i = new Itemtype();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the item type Name");
                String name = sc.nextLine();
                System.out.println("Enter the cost per day");
                Double costPerDay = sc.nextDouble();
                System.out.println("Enter the deposit");
                Double deposit = sc.nextDouble();
                Itemtype items = new Itemtype();
                items.setname(name);
                items.setcostPerDay(costPerDay);
                items.setdeposit(deposit);
                items.display();
            }
        }

