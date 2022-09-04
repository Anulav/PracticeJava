package ooa.designpatterns.creational.builder;

public class AccountBuilderExample {
    public static void main(String[] args) {
        Account account = Account
                .getBuilder()
                .setId(1L)
                .setAccountId("DUMMY")
                .setUsername("dummyUser")
                .build();
        System.out.println(account.toString());
    }
}
