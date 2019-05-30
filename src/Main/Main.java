package Main;

import View.ViewLogin;

public class Main {
    public static void main(String[] args) {
        ViewLogin vl = new ViewLogin(null, true);
        vl.setTitle("Login");
        vl.setResizable(false);
        vl.setLocationRelativeTo(null);
        vl.setVisible(true);
    }
}
