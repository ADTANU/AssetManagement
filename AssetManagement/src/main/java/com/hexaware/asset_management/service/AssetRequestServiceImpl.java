package com.hexaware.asset_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.asset_management.model.AssetRequest;
import com.hexaware.asset_management.repository.AssetRequestRepository;

@Service
public class AssetRequestServiceImpl implements AssetRequestService {

    @Autowired
    private AssetRequestRepository assetRequestRepository;

    @Override
    public String addAssetRequest(AssetRequest assetRequest) {
        assetRequest.setStatus("Pending"); // Default status
        assetRequestRepository.save(assetRequest);
        return "Asset request submitted successfully";
    }

    @Override
    public String updateAssetRequest(AssetRequest assetRequest) {
        if (assetRequestRepository.existsById(assetRequest.getRequestId())) {
            assetRequestRepository.save(assetRequest);
            return "Asset request updated successfully";
        }
        return "Asset request not found";
    }

    @Override
    public List<AssetRequest> getAllAssetRequests() {
        return assetRequestRepository.findAll();
    }

    @Override
    public AssetRequest getRequestById(int requestId) {
        return assetRequestRepository.findById(requestId).orElse(null);
    }

    @Override
    public List<AssetRequest> getRequestsByStatus(String status) {
        return assetRequestRepository.findByStatus(status);
    }
}