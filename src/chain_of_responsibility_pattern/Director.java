package chain_of_responsibility_pattern;

public class Director extends Leader{

    public Director(String name) {
        super(name);
    }

    @Override
    public void HandleRequest(LeaveRequest request) {
        if (request.getDays()<3){
            System.out.println("主任"+this.name+" 批准了该假期");
        }else {
            this.successor.HandleRequest(request);
        }
    }
}
