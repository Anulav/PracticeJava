package ooa.designpatterns.creational.builder;

public class Account {
    private Long id;
    private String username;
    private String accountId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public static Builder getBuilder(){
        return new Account().new Builder();

    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", accountId='" + accountId + '\'' +
                '}';
    }

    class Builder{
        private Builder() {
        }

        public Builder setId(Long id) {
            Account.this.id = id;
            return this;
        }

        public Builder setUsername(String username) {
            Account.this.username = username;
            return this;
        }

        public Builder setAccountId(String accountId) {
            Account.this.accountId = accountId;
            return this;
        }

        public Account build(){
            return Account.this;
        }
    }
}
