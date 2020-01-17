@RequestMapping("/toupdateAsset.do")
public String toupdateAsset(Model model, @RequestParam int id){
model.addAttribute("asset",assetservice.searchbyID(id));
return "updateAsset";
}