package xyz.hooy.m3u8client.util;

public final class OperatingSystemUtils {

    private OperatingSystemUtils() {
    }

    public static OperatingSystem currentOperatingSystem() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            return OperatingSystem.Windows;
        } else if (os.contains("mac")) {
            return OperatingSystem.MacOS;
        } else if (os.contains("linux")) {
            return OperatingSystem.Linux;
        } else {
            throw new UnsupportedOperationException("Unknown operating system!");
        }
    }
}