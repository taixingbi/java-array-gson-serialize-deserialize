package hello;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("----------app----------");

        deserializeUserArray();

        System.out.println("----------app end----------");
    }

    private static void serializeUserArray() {
        List<User> users= new ArrayList<>();
        users.add( new User("1", "taixingbi","tb@gmail.com"));
        users.add( new User("2", "hunter","h@gmail.com"));

        Gson gson = new Gson();
        String json= gson.toJson(users);
        System.out.println("json: "+ json);
    }

    private static void deserializeUserArray() {
        String userJson= "[{\"id\":\"1\",\"name\":\"taixingbi\",\"email\":\"tb@gmail.com\"},{\"id\":\"2\",\"name\":\"hunter\",\"email\":\"h@gmail.com\"}]";
        Gson gson = new Gson();

//        Type userListType = new TypeToken<ArrayList<User>>(){}.getType(); // if array is not root
//        User[] users= gson.fromJson(userJson, userListType);
        User[] users= gson.fromJson(userJson, User[].class);
        for(User user: users){
            System.out.println("user: "+ user.getId() + " " + user.getName());
        }
    }

    private static void serializeUserObj(){
        List<User> users= new ArrayList<>();
        users.add( new User("1", "taixingbi", "tb@gmail.com") );
        users.add( new User("2", "hunter", "tb@gmail.com") );
        Restaurant restaurant = new Restaurant("cheli", users);

        Gson gson = new Gson();
        String json= gson.toJson(restaurant);
        System.out.println("json: "+ json);
    }

    private static void deserializeUserObj() {
        String restaurantJson= "{\"name\":\"cheli\",\"users\":[{\"id\":\"1\",\"name\":\"taixingbi\",\"email\":\"tb@gmail.com\"},{\"id\":\"2\",\"name\":\"hunter\",\"email\":\"tb@gmail.com\"}]}\n";

        Gson gson = new Gson();
        Restaurant restaurant= gson.fromJson(restaurantJson, Restaurant.class);
        String restaurantName= restaurant.getName();
        System.out.println("restaurantName: "+ restaurantName);

    }
}
