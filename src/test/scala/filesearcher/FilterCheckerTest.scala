
package filesearcher

import org.scalatest.FlatSpec

class FilterCheckerTest extends FlatSpec {
  "FilterChecker passed a list where one file matche the filter" should "return a list with that file" in {
    val matchingFile = new FileObject("match")
    val listOfFiles = List(new FileObject("random"), matchingFile)
    val matchedFiles = new FilterChecker("match").findMatchedFiles(listOfFiles)
    assert(matchedFiles == List(matchingFile))
  }
}