package org.givenness.backend.domain.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class OrganizationEmployee {

  @ManyToOne
  @JoinColumn(name = "joined_organization")
  public VolunteerMember joinedOrganization;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long serialNum;
  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date regDate;
  private String department;
  private String name;

}
