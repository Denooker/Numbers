package Svetofor;

public enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);
    private int delay;
    TrafficLightColor(int d) {delay = d;}
    int getDelay(){return delay;}
}
