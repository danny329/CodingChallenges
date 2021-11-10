import re

liste  = ["train_seg/aoi105_c1_20_A", "train_seg/aoi105_c1_30_A", "train_seg/aoi105_c1_30_B", 
          "train_seg/aoi98_c1_20_A", "train_seg/aoi98_c1_30_A", "train_seg/aoi98_c1_30_B", 
          "train_classes/aoi98_c1_20_A", "train_classes/aoi98_c1_30_A", "train_classes/aoi98_c1_30_B",
         "train_classes/aoi105_c1_20_A", "train_classes/aoi105_c1_30_A", "train_classes/aoi105_c1_30_B"]

cat = ["c1"]
seg = ["20", "30"]
com = ["A", "B"]
tag = ["aoi105","aoi98"]
for x in cat:
    for y in seg:
        for z in com:
            for i in tag:
                if y == "20" and z == "B":
                    continue            
                for s in liste:                    
                    train_seg = f'''train_seg/{i}_{x}_{y}_{z}'''
                    train_classes = f'''train_classes/{i}_{x}_{y}_{z}'''
                    if re.findall(train_seg, s): print(s)                        
                    if re.findall(train_classes, s): print(s)
