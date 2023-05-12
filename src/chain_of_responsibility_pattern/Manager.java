package chain_of_responsibility_pattern;

public class Manager extends Leader{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void HandleRequest(LeaveRequest request) {
        if (request.getDays()<10){
            System.out.println("经理"+this.name+" 批准了该假期");
        }else {
            this.successor.HandleRequest(request);
        }
    }
}
