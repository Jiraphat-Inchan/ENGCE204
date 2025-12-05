package Lab;

import java.util.Scanner;

class SystemLogger {

    private static int currentLogLevel = 1;
    private static final int INFO = 1;
    private static final int DEBUG = 2;
    private static final int ERROR = 3;

    private static String getLevelName(int level) {
        switch (level) {
            case INFO: return "INFO";
            case DEBUG: return "DEBUG";
            case ERROR: return "ERROR";
            default: return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel >= INFO && newLevel <= ERROR) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(currentLogLevel));
        } else {
            System.out.println("Invalid log level.");
        }
    }

    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            String levelName = getLevelName(messageLevel);
            System.out.println("[" + levelName + "]: " + message);
        }
    }
}

public class Lab3_10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            if (!scanner.hasNextLine()) {
                return;
            }
            int N = Integer.parseInt(scanner.nextLine().trim());
            
            for (int i = 0; i < N; i++) {
                
                if (!scanner.hasNextLine()) break;
                String command = scanner.nextLine().trim().toUpperCase();

                if (command.equals("SET")) {
                    if (!scanner.hasNextLine()) break;
                    try {
                        int newLevel = Integer.parseInt(scanner.nextLine().trim());
                        SystemLogger.setLogLevel(newLevel);
                    } catch (NumberFormatException e) {
                        break;
                    }

                } else if (command.equals("LOG")) {
                    if (!scanner.hasNextLine()) break;
                    int messageLevel;
                    try {
                        messageLevel = Integer.parseInt(scanner.nextLine().trim());
                    } catch (NumberFormatException e) {
                        break;
                    }
                    
                    if (!scanner.hasNextLine()) break;
                    String message = scanner.nextLine().trim();
                    
                    SystemLogger.log(messageLevel, message);

                }
            }
        }
    }
}
