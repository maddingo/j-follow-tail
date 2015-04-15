package jfollowtail;

import java.io.File;

import mockit.Expectations;
import mockit.Mocked;
import model.LogFile;

import org.junit.Test;

public class LogFileTest {

  @Mocked
  private File logFile;
  
  @Test
  public void checkNotFound() throws Exception {
    new Expectations() {{
      logFile.getPath();
      result = "TEST";
    }};
    LogFile lFile = new LogFile(logFile);
  }
}
