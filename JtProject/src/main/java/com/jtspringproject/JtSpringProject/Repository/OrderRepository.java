package com.jtspringproject.JtSpringProject.Repository;

import com.jtspringproject.JtSpringProject.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
