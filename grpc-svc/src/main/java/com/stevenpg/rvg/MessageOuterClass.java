// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.stevenpg.rvg;

public final class MessageOuterClass {
  private MessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_stevenpg_rvg_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_stevenpg_rvg_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_stevenpg_rvg_Message_Car_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_stevenpg_rvg_Message_Car_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_stevenpg_rvg_Message_Driver_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_stevenpg_rvg_Message_Driver_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_stevenpg_rvg_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_stevenpg_rvg_Result_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\022\020com.stevenpg.rvg\"\210\002\n\007Me" +
      "ssage\022*\n\003car\030\001 \001(\0132\035.com.stevenpg.rvg.Me" +
      "ssage.Car\0220\n\006driver\030\002 \001(\0132 .com.stevenpg" +
      ".rvg.Message.Driver\032^\n\003Car\022\014\n\004make\030\001 \001(\t" +
      "\022\r\n\005model\030\002 \001(\t\022\014\n\004trim\030\003 \001(\t\022\r\n\005color\030\004" +
      " \001(\t\022\014\n\004year\030\005 \001(\r\022\017\n\007mileage\030\006 \001(\r\032?\n\006D" +
      "river\022\021\n\tfirstname\030\001 \001(\t\022\020\n\010lastname\030\002 \001" +
      "(\t\022\020\n\010driverId\030\003 \001(\t\"\030\n\006Result\022\016\n\006status" +
      "\030\001 \001(\t2M\n\016MessageService\022;\n\004send\022\031.com.s" +
      "tevenpg.rvg.Message\032\030.com.stevenpg.rvg.R" +
      "esultB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_stevenpg_rvg_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_stevenpg_rvg_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_stevenpg_rvg_Message_descriptor,
        new java.lang.String[] { "Car", "Driver", });
    internal_static_com_stevenpg_rvg_Message_Car_descriptor =
      internal_static_com_stevenpg_rvg_Message_descriptor.getNestedTypes().get(0);
    internal_static_com_stevenpg_rvg_Message_Car_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_stevenpg_rvg_Message_Car_descriptor,
        new java.lang.String[] { "Make", "Model", "Trim", "Color", "Year", "Mileage", });
    internal_static_com_stevenpg_rvg_Message_Driver_descriptor =
      internal_static_com_stevenpg_rvg_Message_descriptor.getNestedTypes().get(1);
    internal_static_com_stevenpg_rvg_Message_Driver_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_stevenpg_rvg_Message_Driver_descriptor,
        new java.lang.String[] { "Firstname", "Lastname", "DriverId", });
    internal_static_com_stevenpg_rvg_Result_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_stevenpg_rvg_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_stevenpg_rvg_Result_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}