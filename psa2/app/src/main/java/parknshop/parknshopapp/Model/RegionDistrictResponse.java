package parknshop.parknshopapp.Model;

import java.util.ArrayList;

/**
 * Created by chrisyu on 28/4/16.
 */
public class RegionDistrictResponse {
    ArrayList<Region> regions = new ArrayList<Region>();

    class Region {
        String code;
        String name;
        ArrayList<District> districts = new ArrayList<>();

        public ArrayList<District> getDistricts() {
            return districts;
        }

        public ArrayList<String> getStringDistricts() {
            ArrayList<String> arrayListString = new ArrayList<>();
            for(int i = 0; i < districts.size(); i ++) {
                arrayListString.add(districts.get(i).name);
            }
            return arrayListString;
        }
    }

    class District {
        String code;
        String name;
        String pickingCenterCode;
        String fulfillmentType;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public ArrayList<String> getRegionListString() {
        ArrayList<String> regionListString = new ArrayList<>();
        if(regions != null) {
            for (int i = 0; i < regions.size(); i++) {
                regionListString.add(regions.get(i).name);
            }
        }
        return regionListString;
    }

    public ArrayList<District> getDistrictsById(int position) {
        return regions.get(position).getDistricts();
    }

    public String[] getDistrictsByNameSearch(String nameSearch) {
        //return regions.get(position).getDistricts();
        if(regions != null) {
            for (int i = 0; i < regions.size(); i++) {
                //Log.i("regions", "regions" + regions.get(i).name + " " + nameSearch);
                if(regions.get(i).name.equals(nameSearch)) {
                    return regions.get(i).getStringDistricts().toArray(new String[regions.get(i).getStringDistricts().size()]);
                }
            }
        }
        return new String[0];
    }
    /*"regions": [
    {
      "code": "kowloon",
      "name": "九龍",
      "districts": [
        {
          "code": "cheungshawan",
          "name": "長沙灣",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "mongkok",
          "name": "旺角",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "choiwan",
          "name": "彩雲",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "ngauchiwan",
          "name": "牛池灣",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "diamondhill",
          "name": "鑽石山",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "ngautaukok",
          "name": "牛頭角",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "homantin",
          "name": "何文田",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "sanpokong",
          "name": "新蒲崗",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "hunghom",
          "name": "紅磡",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "saumauping",
          "name": "秀茂坪",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "jordan",
          "name": "佐敦",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "shamshuipo",
          "name": "深水埗",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "kowloonbay",
          "name": "九龍灣",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "shekkipmei",
          "name": "石硤尾",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "kowlooncity",
          "name": "九龍城",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "taikoktsui",
          "name": "大角咀",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "kowloontong",
          "name": "九龍塘",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "tokwawan",
          "name": "土瓜灣",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "kwuntong",
          "name": "觀塘",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "tsimshatsui",
          "name": "尖沙咀",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "laichikok",
          "name": "荔枝角",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "tszwanshan",
          "name": "慈雲山",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "lamtin",
          "name": "藍田",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "wongtaisin",
          "name": "黃大仙",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "lokfu",
          "name": "樂富",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "yaumatei",
          "name": "油麻地",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "matauwai",
          "name": "馬頭圍",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "yautong",
          "name": "油塘",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "meifoo",
          "name": "美孚",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "jordanroad",
          "name": "佐敦道",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "lasalleroad",
          "name": "喇沙利道",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "rainbowvillage",
          "name": "彩虹村",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        }
      ]
    },
    {
      "code": "prc",
      "name": "PRC CrossBorder",
      "districts": [
        {
          "code": "prc",
          "name": "PRC CrossBorder",
          "pickingCenterCode": "988",
          "fulfillmentType": "HOMEDELIVERY"
        }
      ]
    },
    {
      "code": "hongkongisland",
      "name": "香港島",
      "districts": [
        {
          "code": "aberdeen",
          "name": "香港仔",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "pokfulam",
          "name": "薄扶林",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "admiralty",
          "name": "金鐘",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "quarrybay",
          "name": "鰂魚涌",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "apleichau",
          "name": "鴨脷洲",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "saiwan",
          "name": "西環",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "bigwavebay",
          "name": "大浪灣",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "shaukeiwan",
          "name": "筲箕灣",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "causewaybay",
          "name": "銅鑼灣",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "sheko",
          "name": "石澳",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "central",
          "name": "中環",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "sheungwanwest",
          "name": "上環西",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "centralsheungwan",
          "name": "中上環",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "siusaiwan",
          "name": "小西灣",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "centralsouth",
          "name": "中環南",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "sokonpo",
          "name": "掃桿埔",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "chaiwan",
          "name": "柴灣",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "southerndistrict",
          "name": "南區",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "gloucesterroad",
          "name": "告士打道",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "stanley",
          "name": "赤柱",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "happyvalley",
          "name": "跑馬地",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "taihangroad",
          "name": "大坑道",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "harbourroad",
          "name": "港灣道",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "thepeak",
          "name": "山頂",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "timmeiave",
          "name": "添美道",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "kennedytown",
          "name": "堅尼地城",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "tinhau",
          "name": "天后",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "laitaktsuen",
          "name": "勵德邨",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "wahfu",
          "name": "華富",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "wanchai",
          "name": "灣仔",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "wongchukhang",
          "name": "黃竹坑",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "northpoint",
          "name": "北角",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "jardineslookout",
          "name": "渣甸山",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "midlevels",
          "name": "中半山",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        },
        {
          "code": "midlevelswest",
          "name": "西半山",
          "pickingCenterCode": "922",
          "fulfillmentType": "HOMEDELIVERY"
        }
      ]
    }]
*/
}
