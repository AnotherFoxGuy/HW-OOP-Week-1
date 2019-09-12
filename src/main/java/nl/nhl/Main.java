package nl.nhl;

import jexer.TApplication;

public class Main extends TApplication {

    private Main() throws Exception {
        super(BackendType.SWING);

        // Create standard menus for Tool, File, and Window.
        addToolMenu();
        addFileMenu();
        addWindowMenu();
    }

    public static void main(String[] args) throws Exception {
        Main app = new Main();
        app.run();
    }
}
