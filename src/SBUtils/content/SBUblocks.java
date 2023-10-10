package SBUtils.content;

import arc.*;
import arc.graphics.*;
import arc.math.*;
import arc.util.*;
import arc.struct.*;

import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

import SBUtils.content.types.blocks.*;
import SBUtils.content.types.blocks.distribution.*;

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
