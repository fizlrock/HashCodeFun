package org.example;

/**
 * BinaryData
 */
public class BinaryData {

  public BinaryData(byte[] bytes) {
    this.bytes = bytes;
  }

  private byte[] bytes;

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (byte b : bytes)
      sb.append(String.format("%02X ", b));

    return sb.toString();
  }
}
