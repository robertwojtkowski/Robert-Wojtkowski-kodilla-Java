package com.example.hibernate.invoice.dao;

import com.example.hibernate.invoice.Invoice;
import com.example.hibernate.invoice.Item;
import com.example.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    private String INVOICE_NAME = "IM123_455";
    private String PRODUCT_NAME = "PN";

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice(INVOICE_NAME);

        Product product = new Product(PRODUCT_NAME);

        Item item1 = new Item(new BigDecimal(23.00), 2, new BigDecimal(19));
        Item item2 = new Item(new BigDecimal(30.00), 1, new BigDecimal(25));

        product.getItemList().add(item1);
        product.getItemList().add(item2);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        // When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
    }

}
