package com.mitre.jpeg
import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestJPEG {

  val runner = Runner("com/mitre/jpeg", "jpeg.tdml", validateTDMLFile = true, validateDFDLSchemas = true)

  @AfterClass def shutdown() = {
    runner.reset()
  }
}

class TestJPEG {
  import TestJPEG._

  @Test def test_IMG_2308() = { runner.runOneTest("IMG_2308") }
  @Test def test_multiImage() = { runner.runOneTest("multiImage") }

}
