package com.knoldus

import com.knoldus.service.AttendanceService
import org.scalatest.flatspec.AnyFlatSpec

class AttendanceServiceSpec extends AnyFlatSpec {
  val consultant = EmployeeRequest("CONS","Akash","Kumar",1500)
  val manager = EmployeeRequest("MANA","Rajat","Kumar",2500)
  val srManager = EmployeeRequest("SRMA","Arpit","Kumar",3500)
  val president = EmployeeRequest("POTC","Aarush","Kumar",4500)
  "AttendanceService" should "return default In and Out Time" in {
    val resultConsultant = AttendanceService.setEmployeeAttendance(consultant)
    val resultManager = AttendanceService.setEmployeeAttendance(manager)
    val resultSrManager = AttendanceService.setEmployeeAttendance(srManager)
    val resultPresident = AttendanceService.setEmployeeAttendance(president)
    assert(resultConsultant.get._1.contains("09:45"))
    assert(resultConsultant.get._2.contains("06:45"))
    assert(resultManager.get._1.contains("09:45"))
    assert(resultManager.get._2.contains("06:45"))
    assert(resultSrManager.get._1.contains("09:45"))
    assert(resultSrManager.get._2.contains("06:45"))
    assert(resultPresident.get._1.contains("09:45"))
    assert(resultPresident.get._2.contains("06:45"))
  }
  "AttendanceService" should "return manual In and Out Time" in {
    val result = AttendanceService.setEmployeeAttendance(consultant, "09:00 AM","06:00 PM")
    assert(result.get._1.contains("09:00"))
    assert(result.get._2.contains("06:00"))
  }

}
