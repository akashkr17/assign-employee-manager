package com.knoldus

import com.knoldus.service.AttendanceService
import org.scalatest.flatspec.AnyFlatSpec

class AttendanceServiceSpec extends AnyFlatSpec {
  val consultant = EmployeeRequest("CONS","Akash","Kumar",1500)
  val manager: Employee = Manager("Rajat","Kumar","2",1500)
  val srManager: Employee = SrManager("Arpit","Kumar","3",1500)
  val president: Employee = President("Aarush","Kumar","4",1500)
  "AttendanceService" should "return default In and Out Time" in {
    val result = AttendanceService.getEmployeeAttendance(consultant)
    println(result)
    assert(result.get._1.contains("09:45"))
    assert(result.get._2.contains("06:45"))
  }
  "AttendanceService" should "return manual In and Out Time" in {
    val result = AttendanceService.getEmployeeAttendance(consultant, "09:00 AM","06:00 PM")
    println(result)
    assert(result.get._1.contains("09:00"))
    assert(result.get._2.contains("06:00"))
  }

}
