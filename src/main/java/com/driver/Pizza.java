package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;

    private int toppingsPrice;

    private int takeAwayPrice;

    boolean isCheeseAdded;
    boolean isToppingsAdded;

    boolean isTakeAwayAdded;

    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice=80;
        this.takeAwayPrice=20;

        if(isVeg){

            this.price=300;
            this.toppingsPrice=70;
        }
        else{
            this.price=400;
            this.toppingsPrice=120;
        }
        this.isTakeAwayAdded=false;
        this.isToppingsAdded=false;
        this.isCheeseAdded=false;

        this.bill="Base Price Of The Pizza: "+this.price+"\n";

        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(!isCheeseAdded){
            this.price+=this.cheesePrice;
            isCheeseAdded=true;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        if(!isToppingsAdded) {
            this.price += this.toppingsPrice;
            isToppingsAdded = true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded){
            this.price+=this.takeAwayPrice;
            isTakeAwayAdded=true;
        }

        // your code goes here
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){

            if(isCheeseAdded==true){
                this.bill=this.bill+"Extra Cheese Added: "+this.cheesePrice+"\n";

            }
            if(isToppingsAdded==true){
                this.bill=this.bill+"Extra Toppings Added: "+this.toppingsPrice+"\n";

            }
            if(isTakeAwayAdded==true){
                this.bill=this.bill+"Paperbag Added: "+this.takeAwayPrice+"\n";

            }
            this.bill=this.bill+"Total Price: "+this.bill+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
