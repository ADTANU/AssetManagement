package com.hexaware.asset_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.asset_management.model.AssetRequest;

@Repository
public interface AssetRequestRepository extends JpaRepository<AssetRequest, Integer> {
    List<AssetRequest> findByStatus(String status);
}