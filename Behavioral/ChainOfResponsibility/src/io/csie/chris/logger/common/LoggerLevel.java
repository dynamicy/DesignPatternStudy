package io.csie.chris.logger.common;

public enum LoggerLevel {

    /* Define the level, 1 the heightest one. */
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
