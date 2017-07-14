package com.mitre.jpeg
import org.junit.Test
import edu.illinois.ncsa.daffodil.tdml.Runner
import org.junit.AfterClass

object TestJPEG {

  val runner = Runner("", "jpeg.tdml", validateTDMLFile = true, validateDFDLSchemas = true)

  @AfterClass def shutdown() = {
    runner.reset
  }
}

class TestJPEG {
  import TestJPEG._

  @Test def test_IMG_2308() { runner.runOneTest("IMG_2308") }

}
