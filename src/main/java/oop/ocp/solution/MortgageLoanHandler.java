package oop.ocp.solution;

import oop.ocp.problem.User;

public class MortgageLoanHandler implements LoanHandler{

    private Validator validator;

    public MortgageLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveLoan(User user) {
        if(validator.isValid(user)){
            //proceed with loan approval
        }else{
            //not
        }
    }
}
