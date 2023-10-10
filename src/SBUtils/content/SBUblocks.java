package SBUtils.content;


import arc.*;
import arc.audio.*;
import arc.func.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.graphics.g2d.TextureAtlas.*;
import arc.math.*;
import arc.math.geom.*;
import arc.scene.ui.layout.*;
import arc.struct.EnumSet;
import arc.struct.*;
import arc.util.*;
import arc.util.pooling.*;

import mindustry.*;
import mindustry.content.*;
import mindustry.core.*;
import mindustry.ctype.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.graphics.MultiPacker.*;
import mindustry.logic.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.ui.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.power.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import java.lang.reflect.*;
import java.util.*;

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
