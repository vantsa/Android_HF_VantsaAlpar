package com.example.hf7;

public class MyCard {
    private String currency;
    private String currencyName;
    private String buy;
    private String sell;
    private Integer cardImg;

    public MyCard(String currency, String currencyName, String buy, String sell, Integer cardImg) {
        this.currency = currency;
        this.currencyName = currencyName;
        this.buy = buy;
        this.sell = sell;
        this.cardImg = cardImg;
    }

    public Integer getCardImg() {
        return cardImg;
    }

    public void setCardImg(Integer cardImg) {
        this.cardImg = cardImg;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }
}
