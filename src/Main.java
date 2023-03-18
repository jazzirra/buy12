import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Milk",40,"****","DAIRY");
        Tovar tovar3 = new Tovar("Cheese",240,"*****","DAIRY");
        Tovar tovar2 = new Tovar("Yogurt",45,"*****","DAIRY");
        Tovar tovar4 = new Tovar("Cottage Cheese",120,"****","DAIRY");
        Tovar tovar5 = new Tovar("Kefir",60,"***","DAIRY");
        Tovar tovar77 = new Tovar("Kurut",5,"*****","DAIRY");


        Tovar tovar6 = new Tovar("Bread",30,"***","FLOUR PRODUCT");
        Tovar tovar7 = new Tovar("Bun",25,"*****","FLOUR PRODUCT");
        Tovar tovar8 = new Tovar("Cake",520,"****","FLOUR PRODUCT");
        Tovar tovar9 = new Tovar("Puncake",50,"***","FLOUR PRODUCT");
        Tovar tovar10 = new Tovar("Cupcake",55,"**","FLOUR PRODUCT");

        Tovar tovar11 = new Tovar("Apple",130,"*****","FRUITS");
        Tovar tovar12= new Tovar("Cearry",190,"*****","FRUITS");
        Tovar tovar13 = new Tovar("Strawberry",240,"*****","FRUITS");
        Tovar tovar14= new Tovar("Peach",230,"*****","FRUITS");
        Tovar tovar15 = new Tovar("Banana",180,"*****","FRUITS");
        Tovar tovar16 = new Tovar("Pear",150,"*****","FRUITS");

        Tovar tovar17 = new Tovar("Onion",57,"****","VEGETABLES");
        Tovar tovar18 = new Tovar("Putato",22,"***","VEGETABLES");
        Tovar tovar19 = new Tovar("Cucumber",45,"*****","VEGETABLES");
        Tovar tovar20= new Tovar("Cabbage",25,"***","VEGETABLES");
        Tovar tovar21 = new Tovar("Carrot",30,"****","VEGETABLES");
        Tovar tovar22 = new Tovar("Tomato",60,"***","VEGETABLES");
        Tovar tova23 = new Tovar("Garlic",80,"*****","VEGETABLES");
        Tovar[]tovars = {tova23,tovar18,tovar20,tovar22,tovar21,tovar19,tovar17,tovar6,tovar7,tovar8,tovar9,tovar10,
                tovar15,tovar11,tovar12,tovar13,tovar14,tovar16,
                tovar1,tovar2,tovar3,tovar77,tovar4,tovar5};
        for (int i = 0; i <tovars.length ; i++) {
            System.out.printf("TOVARS \n"+ tovars[i]);
        }
        System.out.println();


        Tovar[]flour={tovar6,tovar7,tovar8,tovar9,tovar10};
        Tovar[] vegetables={tova23,tovar18,tovar20,tovar22,tovar21,tovar19,tovar17};
        Tovar[]fruits={tovar11,tovar12,tovar13,tovar14,tovar16,tovar15};
        Tovar[]dairy={tovar1,tovar2,tovar3,tovar4,tovar5,tovar77};


        Category category1 = new Category("FLOUR PRODUCT",flour);
        Category category2= new Category("FRUITS",fruits);
        Category category3 = new Category("DAIRY",dairy);
        Category category4 = new Category("VEGETABLES",vegetables);

        Category[]cat ={category1,category2,category3,category4};
        System.out.println("CATEGORT: "  );


            for (int i = 3; i < cat.length;i++ ) {
                System.out.println(category4.getName()+" : ");
            for (int t = 0; t < vegetables.length;t++) {
                System.out.println(vegetables[t].getName());
            }
                System.out.println();
                System.out.println(category2.getName());
            for (int r = 0; r < fruits.length;r++ ) {
                System.out.println(fruits[r].getName());
            }
                System.out.println();
                System.out.println(category1.getName()+" :");
            for (int k = 0; k < flour.length; k++) {
                System.out.println(flour[k].getName());
            }
                System.out.println();
                System.out.println(category3.getName()+" : ");
            for (int l = 0; l < dairy.length;l++ ) {
                System.out.println(dairy[l].getName());
            }
        }




        Scanner scanner = new Scanner(System.in);
        System.out.println("введите логин ");
        String a = scanner.nextLine();
        System.out.println("введите пороль ");
        String b = scanner.nextLine();

        Tovar[]buy01={tovar3,tovar17,tovar11};

        Tovar[]buy02={tovar77,tova23,tovar7};

        Tovar[]buy03={tovar8,tovar20,tovar1};



        User user1 = new User(buy01,"asema","2345");
        User user2 = new User(buy03,"niki","7762");
        User user3 = new User(buy02,"jony","1099");
        User[]users={user1, user2,user3};
int aaa= 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getLogin().contains(a)&&users[i].getPassword().contains(b)) {
                System.out.println(Arrays.toString(users[i].tovarsOfBuy));
                aaa++;
            }
        }
        if (aaa==0){
            System.out.println("вы не правельно ввели пороль");
        }












    }
}