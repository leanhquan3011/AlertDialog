package leanhquan.laq.alertdialog;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    //Trả về đối tượng muốn set chứng năng
    Order build();
}
