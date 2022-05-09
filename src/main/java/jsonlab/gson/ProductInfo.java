package jsonlab.gson;

import java.util.List;

public class ProductInfo {
    private String itemNo;
    private String vModelNo;
    private String desc;
    private List<ProductSpec> specList;

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getvModelNo() {
        return vModelNo;
    }

    public void setvModelNo(String vModelNo) {
        this.vModelNo = vModelNo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<ProductSpec> getSpecList() {
        return specList;
    }

    public void setSpecList(List<ProductSpec> specList) {
        this.specList = specList;
    }
}
