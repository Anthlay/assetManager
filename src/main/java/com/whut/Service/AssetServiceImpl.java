package com.whut.Service;

import com.github.pagehelper.PageHelper;
import com.whut.beans.Assset;
import org.apache.ibatis.annotations.Param;
import com.whut.Dao.assetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssetServiceImpl implements assetService{

    @Autowired
    private assetDao assetdao;
    @Override
    public List<Assset> showAssets(int page, int size){
        PageHelper.startPage(page,size);
        return assetdao.showAssets();
    }

    public void deleteAsset(Assset asset){
        assetdao.deleteAsset(asset);
    }
    @Override
    public List<Assset> findAssetByName(String assetName) {
        return assetdao.findAssetByName(assetName);
    }
    @Override
    public void addAsset(Assset asset){
        assetdao.addAsset(asset);
    }
    @Override
    public boolean updateAsset(Assset asset){
        return assetdao.updateAsset(asset);
    }
    @Override
    public void updateAssetCount(Assset asset){
        assetdao.updateAssetCount(asset);
    }
    @Override
    public void assetCate(Assset asset){
        assetdao.assetCate(asset);
    }
    @Override
    public Assset searchbyID(int id){
        return assetdao.searchbyID(id);
    }
    @Override
    public  List<Assset> showAssetbyName(String assetname){
       return assetdao.showAssetbyName(assetname);
    }

    @Override
    public List<Assset> getAllAsets(){
        List<Assset> assets = assetdao.showAssets();
        for (Assset asset:assets){
            int i = asset.getAssetId();
            String IMG="../res/static/assetImage/"+i+".jpg";
            asset.setIMG(IMG);
        }
        return assets;
    }
}
