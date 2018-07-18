package org.givenness.backend.application;

import java.util.List;
import org.givenness.backend.model.volunteerhistory.VolunteerHistory;

public interface VolunteerHistoryService {

  void recordVolHistory(VolunteerHistory volunteerLog);

  List<VolunteerHistory> readVolHistory(String memberId);

  void removeVolHistory(long historySerialNum);


}
