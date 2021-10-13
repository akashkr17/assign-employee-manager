package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.service.EmployeeService

class EmployeeServiceSpec extends AnyFlatSpec {
  val consultant = EmployeeRequest("CONS","Akash","Kumar",1500)
  val manager = EmployeeRequest("MANA","Rajat","Kumar",2500)
  val srManager = EmployeeRequest("SRMA","Arpit","Kumar",3500)
  val president = EmployeeRequest("POTC","Aarush","Kumar",4500)

  val hr = EmployeeRequest("HR","Robin","Kumar",2500)
  "EmployeeService" should "return Consultant if it match to consultant" in {
    val result = EmployeeService.setEmp(consultant)
    assert(result.get.empId.contains("CONS"))
  }
  "EmployeeService" should "return None if does not match to any employee type " in {
    val result = EmployeeService.setEmp(hr)
    println(result)
    assert(result == None)
  }
  "EmployeeService" should " return employee first name" in {
    val result = EmployeeService.setEmp(consultant)
    assert(result.get.firstName == consultant.firstName  )
  }


}