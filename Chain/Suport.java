package Chain;

class SuportLevel1 extends AbstractHandler{
    @Override
    public void processRequisition(String requisition) {
        if(requisition.equals("Simple")){
            System.out.println("Level 1 handles " + requisition);
        }
        else {
            System.out.println("Level 1 doesn't handle " + requisition);
            super.processRequisition(requisition);
        }
    }
}

class SuportLevel2 extends AbstractHandler{
    @Override
    public void processRequisition(String requisition) {
        if(requisition.equals("Medium")){
            System.out.println("Level 2 handles " + requisition);
        }
        else{
            System.out.println("Level 2 doesn't handle " + requisition);
            super.processRequisition(requisition);
        }
    }
}

class SuportLevel3 extends AbstractHandler{
    @Override
    public void processRequisition(String requisition) {
        if(requisition.equals("Complex")){
            System.out.println("Level 3 handles " + requisition);
        }
    }
}