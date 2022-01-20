package by.epam.trainig.controller.command;

import java.util.HashMap;
import java.util.Map;

public enum CommandProvider {
    SIGN_IN(LoginCommand.INSTANCE, "sign_in"),
    REGISTRATION(RegistrationCommand.INSTANCE, "registration"),
    GO_TO_LOGIN_PAGE(GoToLoginPageCommand.INSTANCE, "go_to_login_page"),
    GO_TO_REGISTRATION_PAGE(GoToRegistrationCommand.INSTANCE, "go_to_registration_page"),
    GO_TO_MAIN_AUTH_PAGE(GoToMainAuthPageCommand.INSTANCE, "go_to_main_auth_page"),
    DEFAULT(GoToMainAuthPageCommand.INSTANCE, "go_to_main_auth_page");

    private final String path;
    private final Command command;

    CommandProvider(Command command, String path) {
        this.command = command;
        this.path = path;
    }

    public static Command getCommand(String commandName) {
        for(CommandProvider constant : values()){
            if(constant.path.equalsIgnoreCase(commandName)){
                return constant.command;
            }
        }
        return DEFAULT.command;
    }
}
