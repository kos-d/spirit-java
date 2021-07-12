package module07.conspectus.materials.theme04;

public enum Planet {
    Earth,
    Mars;
    
    @Override
    public String toString() {
        switch (this) {
            case Earth: return "Земля";
            case Mars: return "Марс";
        }
        return super.toString();
    }
}