package oop.srp.problem;

public class MailSettingsService {
    public void changeSecondaryEmail(User user, String newSecondaryEmail) {
        if (hasAccess(user)) {
            user.setSecondaryEmail(newSecondaryEmail);
        }
    }

    public boolean hasAccess(User user) {
        if (user.getRole() == Role.ADMIN) {
            return true;
        } else {
            return false;
        }

    }
}
