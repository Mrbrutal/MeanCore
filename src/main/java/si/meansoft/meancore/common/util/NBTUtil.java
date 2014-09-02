/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.common.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class NBTUtil {

    /**
     * Check given itemStack for NBTTag key provided with String
     *
     * @param itemStack itemStack in question
     * @param keyName String name
     * @return true if itemStack has NBTTag
     */
    public static boolean hasTag(ItemStack itemStack, String keyName) {
        return itemStack != null && itemStack.stackTagCompound != null && itemStack.stackTagCompound.hasKey(keyName);
    }

    /**
     * Remove the NBTTag key from given itemStack
     *
     * @param itemStack
     * @param keyName
     */
    public static void removeTag(ItemStack itemStack, String keyName) {
        if(itemStack.stackTagCompound != null) {
            itemStack.stackTagCompound.removeTag(keyName);
        }
    }

    /**
     * Remove the whole NBTTag from given itemStack
     *
     * @param itemStack
     */
    public static void removeAll(ItemStack itemStack) {
        if(itemStack.stackTagCompound != null) {
            itemStack.stackTagCompound = null;
        }
    }

    /**
     * Initializes the NBT Tag Compound for the given itemStack if it is null
     *
     * @param itemStack The ItemStack for which its NBT Tag Compound is being checked for initialization
     */
    private static void initNBTTagCompound(ItemStack itemStack) {
        if(itemStack.stackTagCompound == null) {
            itemStack.setTagCompound(new NBTTagCompound());
        }
    }

    /**
     * Initialize NBTTag and add a long value
     *
     * @param itemStack
     * @param keyName
     * @param keyValue
     */
    public static void setLong(ItemStack itemStack, String keyName, long keyValue) {
        initNBTTagCompound(itemStack);
        itemStack.stackTagCompound.setLong(keyName, keyValue);
    }

    /**
     * Get long value from NBTTag
     *
     * @param itemStack
     * @param keyName
     * @return
     */
    public static long getLong(ItemStack itemStack, String keyName) {
        initNBTTagCompound(itemStack);
        if(!itemStack.stackTagCompound.hasKey(keyName)) {
            setLong(itemStack, keyName, 0);
        }
        return itemStack.stackTagCompound.getLong(keyName);
    }

    /**
     * Initialize NBTTag and add a String value
     *
     * @param itemStack
     * @param keyName
     * @param keyValue
     */
    public static void setString(ItemStack itemStack, String keyName, String keyValue) {
        initNBTTagCompound(itemStack);
        itemStack.stackTagCompound.setString(keyName, keyValue);
    }

    /**
     * Get String value from NBTTag
     *
     * @param itemStack
     * @param keyName
     * @return
     */
    public static String getString(ItemStack itemStack, String keyName) {
        initNBTTagCompound(itemStack);
        if(!itemStack.stackTagCompound.hasKey(keyName)) {
            setString(itemStack, keyName, "");
        }
        return itemStack.stackTagCompound.getString(keyName);
    }

    /**
     * Initialize NBTTag and add a boolean value
     *
     * @param itemStack
     * @param keyName
     * @param keyValue
     */
    public static void setBoolean(ItemStack itemStack, String keyName, boolean keyValue) {
        initNBTTagCompound(itemStack);
        itemStack.stackTagCompound.setBoolean(keyName, keyValue);
    }

    /**
     * Get boolean value from NBTTag
     *
     * @param itemStack
     * @param keyName
     * @return
     */
    public static boolean getBoolean(ItemStack itemStack, String keyName) {
        initNBTTagCompound(itemStack);
        if(!itemStack.stackTagCompound.hasKey(keyName)) {
            setBoolean(itemStack, keyName, false);
        }
        return itemStack.stackTagCompound.getBoolean(keyName);
    }

    /**
     * Initialize NBTTag and add a byte value
     *
     * @param itemStack
     * @param keyName
     * @param keyValue
     */
    public static void setByte(ItemStack itemStack, String keyName, byte keyValue) {
        initNBTTagCompound(itemStack);
        itemStack.stackTagCompound.setByte(keyName, keyValue);
    }

    /**
     * Get byte value from NBTTag
     *
     * @param itemStack
     * @param keyName
     * @return
     */
    public static byte getByte(ItemStack itemStack, String keyName) {
        initNBTTagCompound(itemStack);
        if(!itemStack.stackTagCompound.hasKey(keyName)) {
            setByte(itemStack, keyName, (byte) 0);
        }
        return itemStack.stackTagCompound.getByte(keyName);
    }

    /**
     * Initialize NBTTag and add a short value
     *
     * @param itemStack
     * @param keyName
     * @param keyValue
     */
    public static void setShort(ItemStack itemStack, String keyName, short keyValue) {
        initNBTTagCompound(itemStack);
        itemStack.stackTagCompound.setShort(keyName, keyValue);
    }

    /**
     * Get short value from NBTTag
     *
     * @param itemStack
     * @param keyName
     * @return
     */
    public static short getShort(ItemStack itemStack, String keyName) {
        initNBTTagCompound(itemStack);
        if(!itemStack.stackTagCompound.hasKey(keyName)) {
            setShort(itemStack, keyName, (short) 0);
        }
        return itemStack.stackTagCompound.getShort(keyName);
    }

    /**
     * Initialize NBTTag and add a int value
     *
     * @param itemStack
     * @param keyName
     * @param keyValue
     */
    public static void setInteger(ItemStack itemStack, String keyName, int keyValue) {
        initNBTTagCompound(itemStack);
        itemStack.stackTagCompound.setInteger(keyName, keyValue);
    }

    /**
     * Get int value from NBTTag
     *
     * @param itemStack
     * @param keyName
     * @return
     */
    public static int getInt(ItemStack itemStack, String keyName) {
        initNBTTagCompound(itemStack);
        if(!itemStack.stackTagCompound.hasKey(keyName)) {
            setInteger(itemStack, keyName, 0);
        }
        return itemStack.stackTagCompound.getInteger(keyName);
    }

    /**
     * Initialize NBTTag and add a float value
     *
     * @param itemStack
     * @param keyName
     * @param keyValue
     */
    public static void setFloat(ItemStack itemStack, String keyName, float keyValue) {
        initNBTTagCompound(itemStack);
        itemStack.stackTagCompound.setFloat(keyName, keyValue);
    }

    /**
     * Get float value from NBTTag
     *
     * @param itemStack
     * @param keyName
     * @return
     */
    public static float getFloat(ItemStack itemStack, String keyName) {
        initNBTTagCompound(itemStack);
        if(!itemStack.stackTagCompound.hasKey(keyName)) {
            setFloat(itemStack, keyName, 0);
        }
        return itemStack.stackTagCompound.getFloat(keyName);
    }

    /**
     * Initialize NBTTag and add a double value
     *
     * @param itemStack
     * @param keyName
     * @param keyValue
     */
    public static void setDouble(ItemStack itemStack, String keyName, double keyValue) {
        initNBTTagCompound(itemStack);
        itemStack.stackTagCompound.setDouble(keyName, keyValue);
    }

    /**
     * Get double value from NBTTag
     *
     * @param itemStack
     * @param keyName
     * @return
     */
    public static double getDouble(ItemStack itemStack, String keyName) {
        initNBTTagCompound(itemStack);
        if(!itemStack.stackTagCompound.hasKey(keyName)) {
            setDouble(itemStack, keyName, 0);
        }
        return itemStack.stackTagCompound.getDouble(keyName);
    }
}
