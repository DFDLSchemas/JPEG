package com.mitre.jpeg
import org.junit.Test
import edu.illinois.ncsa.daffodil.tdml.DFDLTestSuite
import edu.illinois.ncsa.daffodil.util.Misc

object TestNorway {
  val tdmlFile = "Norway/Norway.tdml"
  val validateTDML = true
  val validateDFDLSchema = true
  lazy val runner = new DFDLTestSuite(Misc.getRequiredResource(tdmlFile), validateTDML, validateDFDLSchema)
  runner.setCheckAllTopLevel(true)
}

class TestNorway {
  import TestNorway._

  @Test def test_Norway() { runner.runOneTest("Norway") }
}