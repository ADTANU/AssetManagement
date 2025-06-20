package com.hexaware.asset_management.service;

import java.util.List;

import com.hexaware.asset_management.model.Asset;

public interface AssetService {
    String addAsset(Asset asset);
    String updateAsset(Asset asset);
    String deleteAsset(int assetId);
    List<Asset> getAllAssets();
    Asset searchAssetById(int assetId);
    List<Asset> searchAssetsByCategory(String category);
}