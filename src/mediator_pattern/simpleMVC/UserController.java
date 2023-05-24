package mediator_pattern.simpleMVC;

public class UserController extends Controller{
    private UserModel user;
    private UserView view;

    public UserController(Component user, Component view) {
        this.user = (UserModel) user;
        this.view = (UserView) view;
    }

    @Override
    public void modelShowOnView() {
        view.display(user.getName(),user.getAge(),user.getType());
    }
}
