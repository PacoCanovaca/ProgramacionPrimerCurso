import model.UserController;

public class Main {

    public static void main(String[] args) {

        UserController userController = new UserController();
        userController.importUser();
        userController.printUserInfo();

    }

}
