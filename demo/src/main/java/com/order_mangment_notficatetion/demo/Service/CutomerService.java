package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.model.Customer;

public class CutomerService {
 static Customer getcustomer(int id){
     return Datebase.customers.get(id);
 }


}
