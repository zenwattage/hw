package src.test.java;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test{

  @Test
  void test() {
    assertEquals(4, add(2,2));
  }

  private Integer add(int i, int j) {
    // TODO Auto-generated method stub
    return i + j;
  }

}