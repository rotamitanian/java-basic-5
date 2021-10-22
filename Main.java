class Main {
    int x;
    int y;

    public static void main(String[] args) {
        Hero hero = new Hero("Rotami Tania Ninata", 20);
        hero.player();
        looping(2, () -> hero.walk());
        looping(3, () -> hero.run());
        looping(5, () -> hero.eat());
        looping(2, () -> hero.drink());
        looping(50, () -> hero.walk());
        looping(6, () -> hero.jump());
        looping(5, () -> hero.sit());
        looping(3, () -> hero.attack());
        hero.player();
    }

    static void looping(int x, Runnable r) {
        for (int i = 0; i < x; i++) {
            r.run();
        }
    }

    // walk 2x, run 3x, eat 5x, drink 2x,  walk 50x, jump 6x, sit 5x, attack 3x
}