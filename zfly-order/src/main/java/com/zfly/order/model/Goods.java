package com.zfly.order.model;

public class Goods {
    private Integer id;

    private String goods;

    private Integer num;

    public Goods(Integer id, String goods, Integer num) {
        this.id = id;
        this.goods = goods;
        this.num = num;
    }

    public Goods() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods == null ? null : goods.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}