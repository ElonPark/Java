package adminCoffee;

public class TableView
{
 private int OrderNum;
 private String id;
 private String name;
 private String menu;
 private String Size;
 private String OrderTime;
 private int Price;
 private String OrderStatus;
 
public int getOrderNum()
{
    return OrderNum;
}
public void setOrderNum(int orderNum)
{
    OrderNum = orderNum;
}
public String getId()
{
    return id;
}
public void setId(String id)
{
    this.id = id;
}
public String getName()
{
    return name;
}
public void setName(String name)
{
    this.name = name;
}
public String getMenu()
{
    return menu;
}
public void setMenu(String menu)
{
    this.menu = menu;
}
public String getSize()
{
    return Size;
}
public void setSize(String size)
{
    Size = size;
}
public String getOrderTime()
{
    return OrderTime;
}
public void setOrderTime(String orderTime)
{
    OrderTime = orderTime;
}
public int getPrice()
{
    return Price;
}
public void setPrice(int price)
{
    Price = price;
}
public String getOrderStatus()
{
    return OrderStatus;
}
public void setOrderStatus(String orderStatus)
{
    OrderStatus = orderStatus;
}
}
