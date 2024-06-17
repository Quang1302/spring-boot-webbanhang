package com.vanlang.webbanhang.reposiory;

import com.vanlang.webbanhang.model.OrderDetail;
import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long>{
}
