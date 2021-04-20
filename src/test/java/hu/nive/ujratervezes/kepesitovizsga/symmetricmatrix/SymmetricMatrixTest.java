package hu.nive.ujratervezes.kepesitovizsga.symmetricmatrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetricMatrixTest {

  SymmetricMatrix symmetricMatrix;

  @BeforeEach
  public void setUp() {
    symmetricMatrix = new SymmetricMatrix();
  }

  @Test
  public void isSymmetricShouldBeTrueWith3X3() {
    int[][] matrix = {{1, 0, 1},
                      {0, 2, 2},
                      {1, 2, 5}
    };
    assertTrue(symmetricMatrix.isSymmetric(matrix));
  }

  @Test
  public void isSymmetricShouldBeTrueWith4X4() {
    int[][] matrix = {{1, 0, 1, 3},
                      {0, 2, 7, 4},
                      {1, 7, 5, 6},
                      {3, 4, 6, 4}
    };
    assertTrue(symmetricMatrix.isSymmetric(matrix));
  }

  @Test
  public void isSymmetricShouldBeTrueWith5X5() {
    int[][] matrix = {{4, 0, 1, 5, 2},
                      {0, 5, 2, 0, 4},
                      {1, 2, 3, 3, 7},
                      {5, 0, 3, 6, -1},
                      {2, 4, 7, -1, 1}
    };
    assertTrue(symmetricMatrix.isSymmetric(matrix));
  }

  @Test
  public void isSymmetricShouldBeFalseWith3X3() {
    int[][] matrix = {{7, 7, 7},
                      {6, 5, 7},
                      {1, 2, 1}
    };
    assertFalse(symmetricMatrix.isSymmetric(matrix));
  }

  @Test
  public void isSymmetricShouldBeFalseWith4X4() {
    int[][] matrix = {{9, 13, 5, 2},
                      {1, 11, 7, 1},
                      {3, 7, 4, 6},
                      {6, 0, 7, 10}
    };
    assertFalse(symmetricMatrix.isSymmetric(matrix));
  }

  @Test
  public void isSymmetricShouldBeFalseWith5X5() {
    int[][] matrix = {{4, 9, 13, 5, 2},
                      {0, 1, 11, 7, 1},
                      {1, 3, 7, 4, 7},
                      {0, 7, 10, 8, -1},
                      {12, 15, 7, -1, 1}
    };
    assertFalse(symmetricMatrix.isSymmetric(matrix));
  }
}
