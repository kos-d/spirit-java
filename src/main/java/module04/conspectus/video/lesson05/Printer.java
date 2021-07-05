package module04.conspectus.video.lesson05;

public class Printer {
    private String printerColor;
    private String mark;
    private double typeSpeed;
    private double paintVolume;
    
    public Printer(String printerColor, String mark, double typeSpeed, double paintVolume) {
        this.printerColor = printerColor;
        this.mark = mark;
        this.typeSpeed = typeSpeed;
        this.paintVolume = paintVolume;
    }

    public String getPrinterColor() {
        return printerColor;
    }

    public void setPrinterColor(String printerColor) {
        this.printerColor = printerColor;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getTypeSpeed() {
        return typeSpeed;
    }

    public void setTypeSpeed(double typeSpeed) {
        this.typeSpeed = typeSpeed;
    }

    public double getPaintVolume() {
        return paintVolume;
    }

    public void setPaintVolume(double paintVolume) {
        this.paintVolume = paintVolume;
    }
    
    
}