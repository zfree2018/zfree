/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.sdnplatform.sync.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

@SuppressWarnings("all") public enum Scope implements org.apache.thrift.TEnum {
  GLOBAL(0),
  LOCAL(1),
  UNSYNCHRONIZED(2);

  private final int value;

  private Scope(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static Scope findByValue(int value) { 
    switch (value) {
      case 0:
        return GLOBAL;
      case 1:
        return LOCAL;
      case 2:
        return UNSYNCHRONIZED;
      default:
        return null;
    }
  }
}