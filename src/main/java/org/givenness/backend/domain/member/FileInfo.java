package org.givenness.backend.domain.member;


import org.givenness.backend.domain.member.valueobj.FileType;


public abstract class FileInfo {


  protected long serialNum;

  protected String filePath;

  protected FileType fileType;

  protected int fileSize;


}
