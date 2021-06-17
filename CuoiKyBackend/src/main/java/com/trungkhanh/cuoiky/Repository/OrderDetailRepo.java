package com.trungkhanh.cuoiky.Repository;

import com.trungkhanh.cuoiky.Entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepo  extends CrudRepository<OrderDetail, Integer> {

}
