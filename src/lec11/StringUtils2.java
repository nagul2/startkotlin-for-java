package lec11;

public class StringUtils2 {

    private StringUtils2() {
    }

    public boolean isDirectoryPath(String path) {
        return path.endsWith("/");
    }
}
