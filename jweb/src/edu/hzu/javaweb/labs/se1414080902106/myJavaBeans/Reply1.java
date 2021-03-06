package edu.hzu.javaweb.labs.se1414080902106.myJavaBeans;

import java.sql.*;

//负责回复帖子、删除1级回复、查看1级回复操作的相关内容
public class Reply1 extends MyJavaBean {
  private int id;
  private int aid;
  private int pid;
  private String text;
  private Date createDateTime;
  private String name;  //作者昵称
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getAid() {
    return aid;
  }
  public void setAid(int aid) {
    this.aid = aid;
  }
  public int getPid() {
    return pid;
  }
  public void setPid(int pid) {
    this.pid = pid;
  }
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  public Date getCreateDateTime() {
    return createDateTime;
  }
  public void setCreateDateTime(Date createDateTime) {
    this.createDateTime = createDateTime;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String getGetSQL(int method) {
    switch (method) {
    case 0:
      in = new int[1];
      in[0] = 0;
      out = new int[5];
      out[0] = 0;
      out[1] = 1;
      out[2] = 2;
      out[3] = 3;
      out[4] = 4;
      return "GetReply1 @id=?";
    case 1:
      in = new int[1];
      in[0] = 2;
      out = new int[5];
      out[0] = 0;
      out[1] = 3;
      out[2] = 1;
      out[3] = 5;
      out[4] = 4;
      return "GetSomeReply1 @pid=?";
    }
    return null;
  }
  @Override
  public String getInsertSQL() {
    in = new int[3];
    in[0] = 1;
    in[1] = 2;
    in[2] = 3;
    return "CreateReply1 @aid=?,@pid=?,@text='?'";
  }
  @Override
  public String getDeleteSQL() {
    in = new int[1];
    in[0] = 0;
    return "DeleteReply1 @id=?";
  }
  @Override
  public String toString() {
    return "{" +
        "\"id\" : \"" + id + "\", " +
        "\"aid\" : \"" + aid + "\", " +
        "\"pid\" : \"" + pid + "\", " +
        "\"text\" : \"" + text + "\", " +
        "\"createDateTime\" : \"" + formatDT(createDateTime) + "\", " +
        "\"name\" : \"" + name + "\"}";
  }
}
