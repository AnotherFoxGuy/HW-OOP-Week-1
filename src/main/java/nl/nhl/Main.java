package nl.nhl;

import jexer.TApplication;

import java.util.ArrayList;

public class Main extends TApplication {

    private Main() throws Exception {
        super(BackendType.SWING);

        // Create standard menus for Tool, File, and Window.
        addToolMenu();
        addFileMenu();
        addWindowMenu();

        new Academie("","", new ArrayList<Kaas>() {{
            new Opleidingen("ksks", "djjd");
            new Opleidingen("ksks", "djjd");
            new Opleidingen("ksks", "djjd");
            new Opleidingen("ksks", "djjd");
            new Opleidingen("ksks", "djjd");
            new Opleidingen("ksks", "djjd");
            new Opleidingen("ksks", "djjd");
            new Opleidingen("ksks", "djjd");
            new Opleidingen("ksks", "djjd");
            new Opleidingen("ksks", "djjd");
        }});
    }

    public static void main(String[] args) throws Exception {
        Main app = new Main();
        app.run();
    }
}
