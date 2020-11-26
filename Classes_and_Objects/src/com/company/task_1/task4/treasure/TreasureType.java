package com.company.task_1.task4.treasure;

public enum TreasureType {
    GOLD("Gold", 10),
    SILVER("Silver", 1),
    DIAMOND("Diamond", 100),
    RUBY("Ruby", 50),
    TOPAZ("Topaz", 30);

    private final String title;
    private final int price;

    TreasureType(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title;
    }
}
