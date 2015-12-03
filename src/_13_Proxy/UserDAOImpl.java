package _13_Proxy;

public class UserDAOImpl implements UserDAO {

    @Override
    public void saveUser(User user) {
        System.out.println("save the user: " + user.getName());
    }

}
