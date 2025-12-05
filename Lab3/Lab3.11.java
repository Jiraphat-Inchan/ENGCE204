package Lab;

import java.util.Scanner;

class SystemConfig {

    private static SystemConfig instance;
    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            synchronized (SystemConfig.class) {
                if (instance == null) {
                    instance = new SystemConfig();
                }
            }
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String url) {
        this.serverUrl = url;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } 
        else {
            System.out.println("Invalid count.");
        }
    }
}

public class Lab3_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            if (!scanner.hasNextLine()) break;

            String commandLine = scanner.nextLine().trim();
            String[] parts = commandLine.split(" ");
            
            if (parts.length == 0 || parts[0].isEmpty()) continue;
            
            String command = parts[0].toUpperCase();
            SystemConfig config = SystemConfig.getInstance(); 

            if (command.equals("SET_URL")) {
                if (parts.length > 1) {
                    String newUrl = parts[1];
                    config.setServerUrl(newUrl);
                }
            } 
            else if (command.equals("SET_MAX")) {
                if (parts.length > 1) {
                    try {
                        int newMax = Integer.parseInt(parts[1]);
                        config.setMaxConnections(newMax);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid count format.");
                    }
                }
            } 
            else if (command.equals("SHOW")) {
                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            }
        }
        
        scanner.close();
    }
}
