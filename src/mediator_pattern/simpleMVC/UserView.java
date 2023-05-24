package mediator_pattern.simpleMVC;

public class UserView extends Component{
    public void display(String name,int age,String type){
        System.out.println("============页面展示：=============");
        System.out.println(name+","+age+",是本站的"+type);
    }
}
