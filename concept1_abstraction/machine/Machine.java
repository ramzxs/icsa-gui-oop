public abstract class Machine {
    int state = 0;
    int mode = -1;

    abstract int powerOn();
    abstract int powerOff();
}
