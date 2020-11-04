package com.lambdaschool.javaorders.services;


import com.lambdaschool.javaorders.models.Customers;
import com.lambdaschool.javaorders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "customerservice")
public class CustomersServiceImpl implements CustomersService {
    @Autowired
    CustomersRepository customerrepo;

    @Transactional

    @Override
    public Customers save(Customers customers) {
        return customerrepo.save(customers);
    }
}
