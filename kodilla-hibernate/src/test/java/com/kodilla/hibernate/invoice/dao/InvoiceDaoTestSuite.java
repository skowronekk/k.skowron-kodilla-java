package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    private static final String NUMBER = ("256/22/07/2018");

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("apples");
        Product product2 = new Product("oranges");
        Item item = new Item(new BigDecimal(20), 5, new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(10), 4, new BigDecimal(40));
        item.setProduct(product);
        item2.setProduct(product2);
        Invoice invoice = new Invoice(NUMBER);
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        item.setProduct(product);
        item2.setProduct(product2);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        productDao.save(product);
        productDao.save(product2);
        itemDao.save(item);
        itemDao.save(item2);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);


        //CleanUp
        //taskListDao.delete(id);
    }

}
