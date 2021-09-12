/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.stevenpg.rvg;

import org.apache.commons.cli.*;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws ParseException, IOException, InterruptedException {

        Options options = new Options();
        options.addOption(new Option("s", "useServer", false, "Whether to run the server or the client. Uses server by default"));

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption("s")) {
            // Run the Server
            new Server().startServer();
        } else {
            // Run the Client
            new Client().executeClient();
        }
    }
}
