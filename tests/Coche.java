public class Coche {
    public int velocidad;

    public void acelerar(int aceleración) {
        velocidad += aceleración;
    }
    public void decelerar(int deceleración) {
        velocidad -= deceleración;
    }
}