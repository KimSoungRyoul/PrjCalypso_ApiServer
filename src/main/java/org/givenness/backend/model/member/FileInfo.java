package org.givenness.backend.model.member;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.givenness.backend.model.member.valueobj.FileType;

@Data
public abstract class FileInfo {


  protected long serialNum;

  //서버의 파일시스템 구조가 드러나게하는 fileURL을 외부로 노출시키지 않는다.
  @JsonIgnore
  protected String filePath;

  protected FileType fileType;

  protected int fileSize;


}
