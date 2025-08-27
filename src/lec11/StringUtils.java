package lec11;

abstract public class StringUtils {

    private StringUtils() {}

    public boolean isDirectoryPath(String path) {
        return path.endsWith("/");
    }
}
