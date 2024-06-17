package com.vanlang.webbanhang.reposiory;

import com.vanlang.webbanhang.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends  JpaRepository<Category, Long>{
}
