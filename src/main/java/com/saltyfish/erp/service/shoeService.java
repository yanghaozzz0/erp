package com.saltyfish.erp.service;


import com.saltyfish.erp.domain.Shoes;

import java.util.List;

public interface shoeService {
    void addStock(String plu);
    void cutStock(String plu);
    List<Shoes> query(String model, String plu, String color, String size, String remark);
    void  add(String model,String plu,String color,String size,String stock,String remark);
    void update(int id,String model,String plu,String color,String size,String stock,String remark);
    void delete(int id);
}
