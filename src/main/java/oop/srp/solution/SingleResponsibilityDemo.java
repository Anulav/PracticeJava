package oop.srp.solution;

import oop.srp.problem.User;
import oop.srp.solution.MailSettingsService;

public class SingleResponsibilityDemo {
    public static void main(String[] args) {
        MailSettingsService settingsService = new MailSettingsService();
        User user = new User();

        // responsibility #1 of the MailSettingsService - change settings in mailbox
        settingsService.changeSecondaryEmail(user, "newemail@email.com");

        // responsibility #1 of the SecurityService - verify access
        SecurityService securityService = new SecurityService();
        if (securityService.hasAccess(user)) {
            user.sendMoney(new User(), 1000);
        }
    }
}
