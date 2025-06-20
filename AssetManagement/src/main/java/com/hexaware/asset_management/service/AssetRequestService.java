package com.hexaware.asset_management.service;

import java.util.List;

import com.hexaware.asset_management.model.AssetRequest;

public interface AssetRequestService {
    String addAssetRequest(AssetRequest assetRequest);
    String updateAssetRequest(AssetRequest assetRequest);
    List<AssetRequest> getAllAssetRequests();
    AssetRequest getRequestById(int requestId);
    List<AssetRequest> getRequestsByStatus(String status);
}