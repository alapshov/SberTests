package testManager;

public class CreateGetRequest {
    private String request;

    /**
     * Передать можно параметры только для трех айтемов, если нужно больше айтемов, придется расширять get запрос и добавлять параметры
     * Передавать параметры в следующем порядке
     * amount
     * item_1_name
     * item_1_quantity
     * item_1_amount
     * item_1_price
     * item_2_name
     * item_2_quantity
     * item_2_amount
     * item_2_price
     * item_3_name
     * item_3_quantity
     * item_3_amount
     * item_3_price
     *
     * @param amount
     * @param item_1_name
     * @param item_1_quantity
     * @param item_1_amount
     * @param item_1_price
     * @param item_2_name
     * @param item_2_quantity
     * @param item_2_amount
     * @param item_2_price
     * @param item_3_name
     * @param item_3_quantity
     * @param item_3_amount
     * @param item_3_price
     */

    public String getRequestBuilder(String amount, String item_1_name, String item_1_quantity, String item_1_amount, String item_1_price,
                                  String item_2_name, String item_2_quantity, String item_2_amount, String item_2_price,
                                  String item_3_name, String item_3_quantity, String item_3_amount, String item_3_price) {

        request = "http://81.177.48.233:443/sbercredit/register.do?amount=%s&currency=643&language=ru&orderNumber=" +
                "1Z21qhуv1uk1rwA1221ав2р12041&password=testPwd&returnUrl=http://yoursite.com?login=test&userName=sbercred5&description=" +
                "Тестовый_заказ&pageView=DESKTOP&sessionTimeoutSecs=86400&orderBundle={\"orderCreationDate\":\"2013-07-12T13:51:00\",\"customerDetails\"" +
                ":{\"email\":\"test@mail.ru\",\"phone\":\" 79032177751\",\"contact\":\"NatalieBianko\",\"deliveryInfo\":{\"deliveryType\":\"courier\"," +
                "\"country\":\"RU\",\"city\":\"Moscow\",\"postAddress\":\"«емл¤ной¬ал50јстр.2\"}},\"cartItems\":{\"items\":[{\"positionId\":\"1\",\"name\":" +
                "\"%s\",\"itemDetails\":{},\"quantity\":{\"value\":%s,\"measure\":\"kg\"},\"itemAmount\":\"%s\",\"itemPrice\":\"%s\"," +
                "\"itemCurrency\":\"643\",\"itemCode\":\"123\",\"discount\":{\"discountType\":\"percent\",\"discountValue\":\"5\"},\"agentInterest\":" +
                "{\"interestType\":\"3\",\"interestValue\":\"2\"}},{\"positionId\":\"2\",\"name\":\"%s\",\"itemDetails\":{},\"quantity\":{\"value\":" +
                "%s,\"measure\":\"kg\"},\"itemAmount\":\"%s\",\"itemPrice\":\"%s\",\"itemCurrency\":\"643\",\"itemCode\":\"666\",\"discount\":" +
                "{\"discountType\":\"percent\",\"discountValue\":\"5\"},\"agentInterest\":{\"interestType\":\"3\",\"interestValue\":\"2\"}},{\"positionId\":" +
                "\"3\",\"name\":\"%s\",\"itemDetails\":{},\"quantity\":{\"value\":%s,\"measure\": \"kg\"},\"itemAmount\":\"%s\",\"itemPrice\":" +
                "\"%s\",\"itemCurrency\":\"643\",\"itemCode\":\"333\",\"discount\":{\"discountType\":\"percent\",\"discountValue\":\"5\"}," +
                "\"agentInterest\":{\"interestType\":\"3\",\"interestValue\":\"2\"}}]},\"installments\":{\"productID\":\"10\",\"productType\":" +
                "\"INSTALLMENT\"}}&jsonParams={\"phone\":\" 79262440101\"}\n" +
                "";
        request = String.format(request, amount, item_1_name, item_1_quantity, item_1_amount, item_1_price, item_2_name,
                item_2_quantity, item_2_amount, item_2_price, item_3_name, item_3_quantity, item_3_amount, item_3_price);

        return request;

    }

}
