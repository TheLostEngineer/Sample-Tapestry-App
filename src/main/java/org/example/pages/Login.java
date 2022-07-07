package org.example.pages;

import org.apache.tapestry5.alerts.AlertManager;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.ioc.annotations.Inject;

public class Login {

  //  private static final Logger logger = LogManager.getLogger(Login.class);

    @Inject
    private AlertManager alertManager;

    @InjectComponent
    private Form login;

    @InjectComponent("email")
    private TextField emailField;

    @InjectComponent("password")
    private PasswordField passwordField;

    @Property
    private String email;

    @Property
    private String password;

    void onValidateFromLogin() {
        if (!email.equals("admin@test.com"))
            login.recordError(emailField, "Try with admin user email");

        if (!password.equals("admin"))
            login.recordError(passwordField, "Try with admin password");
    }

    Object onSuccessFromLogin() {
        login.recordError("Login successful!");
        alertManager.success("Welcome aboard!");
        return EmployeesList.class;
    }

    void onFailureFromLogin() {
        login.recordError("Login error!");
        alertManager.error("It seems you have entered wrong credentials, please try again!");
    }
}
