


public class AsyncDependencyAnalyser {

    public static Future<ClassDepsReport> getClassDependencies(Vertx vertx, File classFile) {
        Promise<ClassDepsReport> promise = Promise.promise();
        vertx.deployVerticle(new ProjectAnalyseVerticle(classFile, promise));
        return promise.future();
    }

    public static Future<ClassDepsReport> getPackageDependencies(Vertx vertx, File packageDir) {
        Promise<ClassDepsReport> promise = Promise.promise();
        vertx.deployVerticle(new ProjectAnalyseVerticle(classFile, promise));
        return promise.future();
    }

    public static Future<ClassDepsReport> getProjectDependencies(Vertx vertx, File projectDir) {
        Promise<ClassDepsReport> promise = Promise.promise();
        vertx.deployVerticle(new ProjectAnalyseVerticle(classFile, promise));
        return promise.future();
    }
}