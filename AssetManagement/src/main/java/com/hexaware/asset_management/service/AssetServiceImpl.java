package com.hexaware.asset_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.asset_management.model.Asset;
import com.hexaware.asset_management.repository.AssetRepository;

@Service
public class AssetServiceImpl implements AssetService {

    @Autowired
    private AssetRepository assetRepository;

    @Override
    public String addAsset(Asset asset) {
        assetRepository.save(asset);
        return "Asset added successfully";
    }

    @Override
    public String updateAsset(Asset asset) {
        if (assetRepository.existsById(asset.getAssetId())) {
            assetRepository.save(asset);
            return "Asset updated successfully";
        }
        return "Asset not found";
    }

    @Override
    public String deleteAsset(int assetId) {
        if (assetRepository.existsById(assetId)) {
            assetRepository.deleteById(assetId);
            return "Asset deleted successfully";
        }
        return "Asset not found";
    }

    @Override
    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

    @Override
    public Asset searchAssetById(int assetId) {
        return assetRepository.findById(assetId).orElse(null);
    }

    @Override
    public List<Asset> searchAssetsByCategory(String category) {
        return assetRepository.findByAssetCategory(category);
    }
}