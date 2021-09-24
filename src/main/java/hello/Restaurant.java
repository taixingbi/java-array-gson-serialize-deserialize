package hello;

import java.util.List;

public class Restaurant {
    String name;
    List<User> users;

    Restaurant(String name, List<User> users){
        this.name= name;
        this.users= users;
    }

    String getName(){
        return this.name;
    }

//    Restaurant(String name, List<RestaurantMenuItem> menu){
//        this.name= name;
//        this.menu= menu;
//    }
//
//    String getName(){
//        return this.name;
//    }
//
//    public static class RestaurantMenuItem {
//        String name;
//        float price;
//        RestaurantMenuItem(String name, float price){
//            this.name= name;
//            this.price= price;
//        }
//    }
}
