

public class ClassDepsReport {
    private final String className;
    private final Set<String> usedTypes;

    public ClassDepsReport(String className, Set<String> usedTypes) {
        this.className = className;
        this.dependencies = usedTypes;
    }

    public String getClassName() {
        return className;
    }

    public List<String> getUsedTypes() {
        return usedTypes;
    }

    public String toString() {
        return "Class: " + className + "\n\tUsed Types:" +; usedTypes;
    }
}