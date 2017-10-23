package io.csie.chris.logger.common;

public enum LoggerLevel {

    /* Define the level, 1 the heightest one. */
//    public static int KERN_EMERG = 1;
//    public static int KERN_ALERT = 2;
//    public static int KERN_CRIT = 3;
//    public static int KERN_WARNING = 4;
//    public static int KERN_NOTICE = 5;
//    public static int KERN_INFO = 6;
//    public static int KERN_DEBUG = 7;
    KERN_EMERG(1),
    KERN_ALERT(2),
    KERN_CRIT(3),
    KERN_WARNING(4),
    KERN_NOTICE(5),
    KERN_INFO(6),
    KERN_DEBUG(7);

    private int level;

    LoggerLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }
}
