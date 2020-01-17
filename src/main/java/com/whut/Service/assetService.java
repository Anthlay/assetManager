package com.whut.Service;

import com.whut.beans.Assset;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface assetService {
    public List<Assset> showAssets(int page,int size);
    List<Assset> findAssetByName(@Param("assetName") String assetName);
    public void addAsset(Assset asset);
    public boolean updateAsset(Assset asset);
    public void deleteAsset(Assset asset);
    public void updateAssetCount(Assset asset);
    public void assetCate(Assset asset);
    Assset searchbyID(int id);
    public  List<Assset> showAssetbyName(String assetname);
    public List<Assset> getAllAsets();
}
