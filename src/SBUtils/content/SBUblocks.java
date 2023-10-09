package SBUtils.content;

import arc.*;
import arc.graphics.*;
import arc.math.*;
import arc.util.*;

import mindustry.*;

public class SBUblocks {
    public static Block

    toggleGate;

    public static void load(){
        toggleGate = new ToggleGate("toggle-gate"){{
            requirements(Category.distribution, with(Items.lead, 2, Items.copper, 4));
            buildCostMultiplier = 3f;
        }};
    }
}
