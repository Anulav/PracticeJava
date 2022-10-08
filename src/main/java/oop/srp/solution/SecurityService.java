package oop.srp.solution;

import oop.srp.problem.Role;
import oop.srp.problem.User;

public class SecurityService {

    public boolean hasAccess(User user) {
        if (user.getRole() == Role.ADMIN) {
            return true;
        } else {
            return false;
        }
    }
}
