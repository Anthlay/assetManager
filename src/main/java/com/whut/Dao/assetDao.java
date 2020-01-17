package com.whut.Dao;

import com.whut.beans.Assset;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface assetDao {
    public List<Assset> showAssets();
    List<Assset> findAssetByName(@Param("assetName") String assetName);
    public void addAsset(Assset asset);
    public void deleteAsset(Assset asset);
    public boolean updateAsset(Assset asset);
    public void updateAssetCount(Assset asset);
    public void assetCate(Assset asset);
    Assset searchbyID(int id);
    public  List<Assset> showAssetbyName(String assetname);
}
