package com.hexaware.asset_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hexaware.asset_management.model.Asset;
import com.hexaware.asset_management.service.AssetService;


public class AssetController {
	@Autowired
    private AssetService assetService;
    
    @PostMapping("/add")
    public String addAsset(@RequestBody Asset asset) {
        return assetService.addAsset(asset);
    }
    
    @PutMapping("/update")
    public String updateAsset(@RequestBody Asset asset) {
        return assetService.updateAsset(asset);
    }
    
    @DeleteMapping("/delete/{assetId}")
    public String deleteAsset(@PathVariable int assetId) {
        return assetService.deleteAsset(assetId);
    }
    
    @GetMapping("/all")
    public List<Asset> getAllAssets() {
        return assetService.getAllAssets();
    }
    
    @GetMapping("/search/{assetId}")
    public Asset searchAssetById(@PathVariable int assetId) {
        return assetService.searchAssetById(assetId);
    }
    
    @GetMapping("/searchByCategory/{category}")
    public List<Asset> searchAssetsByCategory(@PathVariable String category) {
        return assetService.searchAssetsByCategory(category);
    }
}
