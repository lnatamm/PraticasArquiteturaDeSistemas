package Chain;

public abstract class AbstractHandler {
    private AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void processRequisition(String requisition){
        if(nextHandler != null){
            nextHandler.processRequisition(requisition);
        }
    }

}
