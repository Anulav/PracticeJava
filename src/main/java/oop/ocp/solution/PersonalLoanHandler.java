package oop.ocp.solution;

import oop.ocp.problem.User;

public class PersonalLoanHandler implements LoanHandler {
    private Validator validator;

    public PersonalLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveLoan(User user) {
        if(validator.isValid(user)){
            //proceed with personal loan approval
        }else{
            //not
        }
    }
}
