	package io.javabrains.springsecurityjpajavabrains.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.springsecurityjpajavabrains.Entity.OrderDetail;

public interface SheetRepository extends JpaRepository<OrderDetail, Double> {

}
