public class Session0215 {
    public static void main(String[] args) {
        /*
        The output must be:
            >Double amount: * dollars
            >The amount itself: *
         */
        double value;
        String currencyName;
        value = 20.0;
        currencyName = "dollars";
        String playerInfo;
        playerInfo = "Double amount: " + value * 2 + " " + currencyName;
        String amountText;
        amountText = "The amount itself:";
        System.out.println(playerInfo);
        System.out.println(amountText + " " + value);
    }
}


//TODO play around with if/else statements