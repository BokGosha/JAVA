package ru.mirea.lab4.Clothes;

public enum Clothes_var {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    public int getEuroSize() {
        return euroSize;
    }

    Clothes_var(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}