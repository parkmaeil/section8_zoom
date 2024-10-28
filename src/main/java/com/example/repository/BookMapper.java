package com.example.repository;

import com.example.entity.Bible;
import com.example.entity.Book;
import com.example.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {
    public List<Book> bookList();
    public void saveBook(Book dto);
    public Customer login(Customer customer);
    public void bibleInsert(Bible bible);
    List<Map<String, Object>> getMonthlyData(String customerId);
    List<Customer> customers();
}
