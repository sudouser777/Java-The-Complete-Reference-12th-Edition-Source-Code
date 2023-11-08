// Use an enum constructor. 
enum Apple {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);

    private int price; // price of each apple

    // Constructor
    Apple(int p) {
        price = p;
    }

    // Overloaded constructor
    Apple() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}
