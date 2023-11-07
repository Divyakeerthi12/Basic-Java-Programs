class cake {
    String name;
    float price;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setPrice(float price)
    {
        this.price=price;
    }
    public float getPrice()
    {
        return price;
    }
    public void display()
    {
        System.out.println(name+" : "+"\u20B9"+price+"per pound");
    }

}

