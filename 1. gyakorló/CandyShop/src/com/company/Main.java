package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            CandyShop candyShop = new CandyShop(1980);
            candyShop.createCandy(new Lollipop());
            candyShop.sell(1);
            candyShop.buySugar(1);
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new Lollipop());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new HardCandy());
            candyShop.createCandy(new HardCandy());
            candyShop.sell(36);
            System.out.println(candyShop);
        } catch (InsufficientSugarException | InsufficientFunds exception) {
            exception.printStackTrace();

        }
    }
}