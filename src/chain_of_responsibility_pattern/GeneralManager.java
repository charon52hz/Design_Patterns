package chain_of_responsibility_pattern;

public class GeneralManager extends Leader{
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void HandleRequest(LeaveRequest request) {
        if (request.getDays()<30){
            System.out.println("总经理"+this.name+" 批准了该假期");
        }else {
            System.out.println("该假期请求被拒绝！");
        }
    }
}
