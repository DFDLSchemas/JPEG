package com.mitre.jpeg
import org.junit.Test
import org.junit.AfterClass
import org.apache.daffodil.tdml.Runner

object TestNorway {

  val runner = Runner("com/mitre/jpeg", "Norway/Norway.tdml",
    validateTDMLFile = true,
    validateDFDLSchemas = true,
    compileAllTopLevel = true)

  @AfterClass def shutdown() = {
    runner.reset()
  }
}

class TestNorway {
  import TestNorway._

  @Test def test_Norway() = { runner.runOneTest("Norway") }
  @Test def test_notEmptyJPEG() = { runner.runOneTest("notEmptyJPEG") }
  @Test def test_missingEOI1() = { runner.runOneTest("missingEOI1") }
  @Test def test_notDataBlob1() = { runner.runOneTest("notDataBlob1") }
  @Test def test_minimal1() = { runner.runOneTest("minimal1") }
  @Test def test_penguins() = { runner.runOneTest("Penguins") }
}
