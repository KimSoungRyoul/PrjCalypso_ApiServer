package org.givenness.backend.application;

import java.util.List;
import org.givenness.backend.model.volunteerhistory.VolunteerHistory;
import org.springframework.stereotype.Service;

@Service
public class VolunteerHistoryServiceImpl implements VolunteerHistoryService {

  @Override
  public void recordVolHistory(VolunteerHistory volunteerLog) {
  }

  @Override
  public List<VolunteerHistory> readVolHistory(String memberId) {

    return null;
  }

  @Override
  public void removeVolHistory(long historySerialNum) {
  }
}
