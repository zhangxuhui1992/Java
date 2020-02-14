package com.re;

/**
 * @author zxh
 * @create 2020-02-12 10:40
 */
interface flytoSky {
    int AGE = 120; //public static final Ê¡ÂÔ
    void fiytoSky(); //public abstract Ê¡ÂÔ
}

class BirdMan implements flytoSky{
    @Override
    public void fiytoSky() {
        System.out.println("I believe i can fly i am birdman!");
    }
}

public class fly{
    public static void main(String[] args) {
        flytoSky ff = new BirdMan();
        ff.fiytoSky();
    }
}