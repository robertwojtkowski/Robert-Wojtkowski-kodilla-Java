package pl.kopka.patterns;

public class Logger {
    private String lastLog = "";
    private static Logger loggerInstance = null;

    public static Logger getInstance(){
        if (loggerInstance == null){
            synchronized (Logger.class){
                loggerInstance = new Logger();
            }
        }
        return loggerInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
