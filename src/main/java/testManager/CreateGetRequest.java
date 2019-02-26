package testManager;

public class CreateGetRequest {
    private String request;
    public void getRequestBuilder(){

        request = "http://81.177.48.233:443/sbercredit/register.do?amount=%s&currency=643&language=ru&orderNumber=" +
                "1Z21qhуv1uk1rwA1221ав2р12041&password=testPwd&returnUrl=http://yoursite.com?login=test&userName=sbercred5&description=" +
                "Тестовый_заказ&pageView=DESKTOP&sessionTimeoutSecs=86400&orderBundle={\"orderCreationDate\":\"2013-07-12T13:51:00\",\"customerDetails\"" +
                ":{\"email\":\"test@mail.ru\",\"phone\":\" 79032177751\",\"contact\":\"NatalieBianko\",\"deliveryInfo\":{\"deliveryType\":\"courier\"," +
                "\"country\":\"RU\",\"city\":\"Moscow\",\"postAddress\":\"«емл¤ной¬ал50јстр.2\"}},\"cartItems\":{\"items\":[{\"positionId\":\"1\",\"name\":" +
                "\"carrotsbox\",\"itemDetails\":{},\"quantity\":{\"value\":1,\"measure\":\"kg\"},\"itemAmount\":\"300000\",\"itemPrice\":\"300000\"," +
                "\"itemCurrency\":\"643\",\"itemCode\":\"123\",\"discount\":{\"discountType\":\"percent\",\"discountValue\":\"5\"},\"agentInterest\":" +
                "{\"interestType\":\"3\",\"interestValue\":\"2\"}},{\"positionId\":\"2\",\"name\":\"applesbox\",\"itemDetails\":{},\"quantity\":{\"value\":" +
                "1,\"measure\":\"kg\"},\"itemAmount\":\"3000000\",\"itemPrice\":\"3000000\",\"itemCurrency\":\"643\",\"itemCode\":\"666\",\"discount\":" +
                "{\"discountType\":\"percent\",\"discountValue\":\"5\"},\"agentInterest\":{\"interestType\":\"3\",\"interestValue\":\"2\"}},{\"positionId\":" +
                "\"3\",\"name\":\"applesbox\",\"itemDetails\":{},\"quantity\":{\"value\":2,\"measure\": \"kg\"},\"itemAmount\":\"600000\",\"itemPrice\":" +
                "\"300000\",\"itemCurrency\":\"643\",\"itemCode\":\"333\",\"discount\":{\"discountType\":\"percent\",\"discountValue\":\"5\"}," +
                "\"agentInterest\":{\"interestType\":\"3\",\"interestValue\":\"2\"}}]},\"installments\":{\"productID\":\"10\",\"productType\":" +
                "\"INSTALLMENT\"}}&jsonParams={\"phone\":\" 79262440101\"}\n" +
                "";
        request = String.format(request,"36000");

    }

}
