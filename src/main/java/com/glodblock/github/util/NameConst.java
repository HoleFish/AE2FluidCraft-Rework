package com.glodblock.github.util;

import com.glodblock.github.FluidCraft;
import java.util.ArrayList;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.StatCollector;

public class NameConst {

    public static final String BLOCK_FLUID_DISCRETIZER = "fluid_discretizer";
    public static final String BLOCK_FLUID_PATTERN_ENCODER = "fluid_pattern_encoder";
    public static final String BLOCK_FLUID_PACKET_DECODER = "fluid_packet_decoder";
    public static final String BLOCK_FLUID_INTERFACE = "fluid_interface";
    public static final String BLOCK_INGREDIENT_BUFFER = "ingredient_buffer";
    public static final String BLOCK_FLUID_BUFFER = "fluid_buffer";
    public static final String BLOCK_LARGE_INGREDIENT_BUFFER = "large_ingredient_buffer";
    public static final String BLOCK_OC_PATTERN_EDITOR = "oc_pattern_editor";
    public static final String BLOCK_LEVEL_MAINTAINER = "level_maintainer";

    public static final String ITEM_FLUID_DROP = "fluid_drop";
    public static final String ITEM_FLUID_ENCODED_PATTERN = "fluid_encoded_pattern";
    public static final String ITEM_PART_FLUID_TERMINAL = "part_fluid_terminal";
    public static final String ITEM_PART_FLUID_PATTERN_TERMINAL = "part_fluid_pattern_terminal";
    public static final String ITEM_PART_FLUID_PATTERN_TERMINAL_EX = "part_fluid_pattern_terminal_ex";
    public static final String ITEM_PART_FLUID_INTERFACE = "part_fluid_interface";
    public static final String ITEM_PART_FLUID_IMPORT = "part_fluid_import";
    public static final String ITEM_PART_FLUID_EXPORT = "part_fluid_export";
    public static final String ITEM_FLUID_PACKET = "fluid_packet";
    public static final String ITEM_FLUID_STORAGE = "fluid_storage";
    public static final String ITEM_FLUID_PART = "fluid_part";

    public static final String TT_KEY = FluidCraft.MODID + ".tooltip.";
    public static final String TT_FLUID_TERMINAL = TT_KEY + "fluid_terminal";
    public static final String TT_INVALID_FLUID = TT_KEY + "invalid_fluid";
    public static final String TT_FLUID_PACKET = TT_KEY + "fluid_packet";
    public static final String TT_ENCODE_PATTERN = TT_KEY + "encode_pattern";
    public static final String TT_EMPTY = TT_KEY + "empty";
    public static final String TT_DUMP_TANK = TT_KEY + "dump_tank";
    public static final String TT_SHIFT_FOR_MORE = TT_KEY + "shift_for_more";
    public static final String TT_FLUID_BUFFER = TT_KEY + "fluid_buffer.";
    public static final String TT_FLUID_PACKET_DECODER = TT_KEY + "fluid_packet_decoder.";
    public static final String TT_FLUID_PACKET_DECODER_DESC = TT_FLUID_PACKET_DECODER + "desc";
    public static final String TT_FLUID_BUFFER_DESC = TT_FLUID_BUFFER + "desc";
    public static final String TT_FLUID_DISCRETIZER = TT_KEY + "discretizer.";
    public static final String TT_FLUID_DISCRETIZER_DESC = TT_FLUID_DISCRETIZER + "desc";
    public static final String TT_LEVEL_MAINTAINER = TT_KEY + "level_maintainer.";
    public static final String TT_LEVEL_MAINTAINER_DESC = TT_LEVEL_MAINTAINER + "desc";
    public static final String TT_LEVEL_MAINTAINER_WHO_AM_I = TT_LEVEL_MAINTAINER + "Who_Am_I";
    public static final String TT_LEVEL_MAINTAINER_TITLE = TT_LEVEL_MAINTAINER + "title";
    public static final String TT_LEVEL_MAINTAINER_CURRENT = TT_LEVEL_MAINTAINER + "current";
    public static final String TT_LEVEL_MAINTAINER_NONE = TT_LEVEL_MAINTAINER + "none";
    public static final String TT_LEVEL_MAINTAINER_REQUEST_SIZE = TT_LEVEL_MAINTAINER + "request_size";
    public static final String TT_LEVEL_MAINTAINER_BATCH_SIZE = TT_LEVEL_MAINTAINER + "batch_size";
    public static final String TT_LEVEL_MAINTAINER_IDLE = TT_LEVEL_MAINTAINER + "idle";
    public static final String TT_LEVEL_MAINTAINER_IDLE_DESC = TT_LEVEL_MAINTAINER + "idle_desc";
    public static final String TT_LEVEL_MAINTAINER_LINK = TT_LEVEL_MAINTAINER + "link";
    public static final String TT_LEVEL_MAINTAINER_LINK_DESC = TT_LEVEL_MAINTAINER + "link_desc";
    public static final String TT_LEVEL_MAINTAINER_EXPORT = TT_LEVEL_MAINTAINER + "export";
    public static final String TT_LEVEL_MAINTAINER_EXPORT_DESC = TT_LEVEL_MAINTAINER + "export_desc";
    public static final String TT_CELL_CONTENTS = TT_KEY + "cell_contents";

    public static final String WAILA_KEY = FluidCraft.MODID + ".waila.";
    public static final String WAILA_ENABLE = WAILA_KEY + "enable";
    public static final String WAILA_DISABLE = WAILA_KEY + "disable";
    public static final String WAILA_SPEED = WAILA_KEY + "speed";
    public static final String RES_KEY = FluidCraft.MODID + ":";

    public static final String GUI_KEY = FluidCraft.MODID + ".gui.";
    public static final String GUI_FLUID_TERMINAL = GUI_KEY + ITEM_PART_FLUID_TERMINAL;
    public static final String GUI_FLUID_PATTERN_TERMINAL = GUI_KEY + ITEM_PART_FLUID_PATTERN_TERMINAL;
    public static final String GUI_FLUID_PATTERN_TERMINAL_EX = GUI_KEY + ITEM_PART_FLUID_PATTERN_TERMINAL_EX;
    public static final String GUI_LEVEL_MAINTAINER = GUI_KEY + BLOCK_LEVEL_MAINTAINER;
    public static final String GUI_FLUID_PATTERN_ENCODER = GUI_KEY + BLOCK_FLUID_PATTERN_ENCODER;
    public static final String GUI_FLUID_PACKET_DECODER = GUI_KEY + BLOCK_FLUID_PACKET_DECODER;
    public static final String GUI_INGREDIENT_BUFFER = GUI_KEY + BLOCK_INGREDIENT_BUFFER;
    public static final String GUI_LARGE_INGREDIENT_BUFFER = GUI_KEY + BLOCK_LARGE_INGREDIENT_BUFFER;
    public static final String GUI_FLUID_INTERFACE = GUI_KEY + BLOCK_FLUID_INTERFACE;
    public static final String GUI_OC_PATTERN_EDITOR = GUI_KEY + BLOCK_OC_PATTERN_EDITOR;
    public static final String GUI_FLUID_IMPORT = GUI_KEY + ITEM_PART_FLUID_IMPORT;
    public static final String GUI_FLUID_EXPORT = GUI_KEY + ITEM_PART_FLUID_EXPORT;

    public static String i18n(String t, String delimiter, boolean hint) {
        if (!hint) {
            return I18n.format(t);
        }
        ArrayList<String> arr = new ArrayList<>();
        arr.add(I18n.format(t));
        if (!StatCollector.translateToLocal(t + ".hint").equals(t + ".hint")) {
            arr.add(I18n.format(t + ".hint"));
        }
        return String.join(delimiter, arr);
    }

    public static String i18n(String t) {
        return i18n(t, "\n", true);
    }

    public static String i18n(String t, boolean warp) {
        if (warp) {
            return i18n(t);
        } else {
            return i18n(t, "", true);
        }
    }
}
