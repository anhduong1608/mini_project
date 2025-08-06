package ra.edu.model.dto;

import ra.edu.model.entity.Customer;

public class UserSession {
    private Customer  customer;
    private Boolean isLogin;

    public UserSession() {
        isLogin = false;
    }

    public UserSession(Customer customer, Boolean isLogin) {
        this.customer = customer;
        this.isLogin = isLogin;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Boolean getLogin() {
        return isLogin;
    }

    public void setLogin(Boolean login) {
        isLogin = login;
    }
}
