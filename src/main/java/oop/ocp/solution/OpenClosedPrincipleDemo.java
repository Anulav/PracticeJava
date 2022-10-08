package oop.ocp.solution;

import oop.ocp.problem.User;

public class OpenClosedPrincipleDemo {
    public static void main(String[] args) {
        LoanHandler personalLoanHandler = new PersonalLoanHandler(new PersonalLoanValidator());
        LoanHandler mortgageLoanHandler = new MortgageLoanHandler(new PersonalLoanValidator());
        User user = new User();
        personalLoanHandler.approveLoan(user);
        mortgageLoanHandler.approveLoan(user);
    }
}


/*
* Herein if we want to have a new LoanHandler then we don't need to modify any class just implement the interfaces
* LoanHandler ,Validator interfaces and in main create the classes object and validators object.
*
* Also the validator in the Handlers are generic one. So that In future if the validator changes we can add a new
* validator all together.
* */