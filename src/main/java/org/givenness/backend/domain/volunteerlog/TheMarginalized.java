package org.givenness.backend.domain.volunteerlog;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.givenness.backend.domain.member.TheMarginalizedAdminMember;
import org.givenness.backend.domain.volunteerlog.valueobj.MarginalizedType;

@Entity
@Data
//소외 계층
public class TheMarginalized {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long serialNum;

  @ManyToOne
  @JoinColumn(name = "manager_admin_id")
  private TheMarginalizedAdminMember marginalizedManager;

  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date regDate;

  @Enumerated(EnumType.STRING)
  private MarginalizedType marginalizedType;

  private String name;


}
