package SBUtils;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class SBUtils extends Mod{

    public SBUtils(){
        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("Usage Disclaimer");
                dialog.cont.add("This mod is meant for use in sandbox mode only.").row();
                dialog.cont.add("This isn't a hard restriction, but you may not find a research tree or obtainable materials.").row();
                dialog.cont.button("Ok", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }
}
