package org.givenness.backend.domain.member;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import org.givenness.backend.domain.member.valueobj.FileType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "file_purpose")
public abstract class FileInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected long serialNum;

  protected String filePath;

  @Enumerated(EnumType.STRING)
  protected FileType fileType;

  protected int fileSize;


}
