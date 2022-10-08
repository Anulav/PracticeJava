package oop.ocp.problem;

public class OpenClosedPrincipleDemo {
    public static void main(String[] args) {
        LoanHandler loanHandler = new LoanHandler();
        User user = new User();

        loanHandler.approvePersonalLoan(user);
        loanHandler.approveMortgage(user);

    }
}

/*
* Imagine that your program has to approve current loans.
* What would you do?
* First of all, you can add one more method in LoanHandler and add one more validator.
* OK, now you have three different methods, so you need to open a loan handler and to change there.
* That means LoanHandler unit is not closed.
*
* But you might think what the harm of modification is of LoanHandler class.
* Probably in this particular case there is no become but Java applications often a bit more complex.
* For example, making changes in this class means you need to retest all scenarios carefully where this
* class works to make sure you didn't break anything accidentally.
* Changing something in this class means you can't release it separately because you need to keep it for
* further adjustments.
*
*
* */