package net.fabricmc.example.client.screen;

import io.wispforest.owo.ui.base.BaseOwoScreen;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.component.Components;
import io.wispforest.owo.ui.core.HorizontalAlignment;
import io.wispforest.owo.ui.core.Insets;
import io.wispforest.owo.ui.core.Sizing;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class OilRefineryScreen extends BaseOwoScreen<FlowLayout> {

    public OilRefineryScreen() {
        super(FlowLayout::new);
    }

    @Override
    protected void build(FlowLayout root) {
        root.padding(Insets.of(10));
        root.horizontalAlignment(HorizontalAlignment.CENTER);
        root.verticalAlignment(HorizontalAlignment.CENTER);
        root.gap(8);

        root.child(
                Components.label(Text.literal("Oil Refinery"))
                        .horizontalAlignment(HorizontalAlignment.CENTER)
        );

        root.child(
                Components.label(Text.literal("Simple test GUI using owo-ui"))
        );

        root.child(
                Components.button(Text.literal("Refine Test Oil"), button -> {
                    if (MinecraftClient.getInstance().player != null) {
                        MinecraftClient.getInstance().player.sendMessage(
                                Text.literal("Clicked oil refining test button"),
                                false
                        );
                    }
                }).sizing(Sizing.fixed(150), Sizing.fixed(20))
        );
    }
}
