package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
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
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Beer");
        Product product2 = new Product("Milk");

        Item item1 = new Item(new BigDecimal(2), 2, new BigDecimal(4));
        Item item2 = new Item(new BigDecimal(4), 2, new BigDecimal(8));

        product1.getItems().add(item1);
        product2.getItems().add(item2);

        Invoice invoice = new Invoice("NMN132");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item1.setProduct(product1);
        item2.setProduct(product2);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
