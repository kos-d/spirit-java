package goit.module09_io.conspectus.video.lesson06;

public enum DayOfWeek {
    SUNDAY("Sunday", 1) {
        @Override
        public void workDayOrNot() {
            System.out.println(getDayOfWeek() + " Free day");
        }
    },
    MONDAY("Monday", 2) {
        @Override
        public void workDayOrNot() {
            System.out.println(getDayOfWeek() + " Work day");
        }
    },
    TUESDAY("Tuesday", 3) {
        @Override
        public void workDayOrNot() {
            System.out.println(getDayOfWeek() + " Work day");
        }
    },
    WEDNESDAY("Wednesday", 4) {
        @Override
        public void workDayOrNot() {
            System.out.println(getDayOfWeek() + " Work day");
        }
    },
    THURSDAY("Thursday", 5) {
        @Override
        public void workDayOrNot() {
            System.out.println(getDayOfWeek() + " Work day");
        }
    },
    FRIDAY("Friday", 6) {
        @Override
        public void workDayOrNot() {
            System.out.println(getDayOfWeek() + " Work day");
        }
    },
    SATURDAY("Saturday", 7) {
        @Override
        public void workDayOrNot() {
            System.out.println(getDayOfWeek() + " Free day");
        }
    };
    
    private String dayOfWeek;
    private Integer dayIdentifier;
    
    DayOfWeek(String dayOfWeek, Integer dayIdentifier) {
        this.dayOfWeek = dayOfWeek;
        this.dayIdentifier = dayIdentifier;
    }
    
    public String getDayOfWeek() {
        return dayOfWeek;
    }
    
    public Integer getDayIdentifier() {
        return dayIdentifier;
    }
    
    public abstract void workDayOrNot();
}
