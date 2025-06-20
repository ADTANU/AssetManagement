package com.hexaware.asset_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.asset_management.model.AssetRequest;
import com.hexaware.asset_management.service.AssetRequestService;

@RestController
@RequestMapping("/api/asset-requests")
public class AssetRequestController {

    @Autowired
    private AssetRequestService assetRequestService;

    @PostMapping("/submit")
    public String submitRequest(@RequestBody AssetRequest assetRequest) {
        return assetRequestService.addAssetRequest(assetRequest);
    }

    @PutMapping("/update")
    public String updateRequest(@RequestBody AssetRequest assetRequest) {
        return assetRequestService.updateAssetRequest(assetRequest);
    }

    @GetMapping("/all")
    public List<AssetRequest> getAllRequests() {
        return assetRequestService.getAllAssetRequests();
    }

    @GetMapping("/{requestId}")
    public AssetRequest getRequest(@PathVariable int requestId) {
        return assetRequestService.getRequestById(requestId);
    }

    @GetMapping("/status/{status}")
    public List<AssetRequest> getRequestsByStatus(@PathVariable String status) {
        return assetRequestService.getRequestsByStatus(status);
    }
}