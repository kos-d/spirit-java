package module07.conspectus.materials.theme04;

public enum DeveloperLevel {
    JUNIOR(0) {
        @Override
        public boolean isJunior() {
            return true;
        }
    },
    MIDDLE(2) {
        @Override
        public boolean isMiddle() {
            return true;
        }
    },
    SENIOR(5) {
        @Override
        public boolean isSenior() {
            return true;
        }
    };
    
    private int yearsOfExperience;
    
    public boolean isJunior() { return false; }
    
    public boolean isMiddle() { return false; }
    
    public boolean isSenior() { return false; }
    
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
    DeveloperLevel (int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}