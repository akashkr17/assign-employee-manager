package com.knoldus

import com.knoldus.service.{AttendanceService, EmployeeService}

object Main extends App {

  val consultant = EmployeeRequest("CONS", "Akash", "Kumar", 1500)
  val manager = EmployeeRequest("MANA", "Rajat", "Kumar", 1500)
  val srManager = EmployeeRequest("SRMA", "Arpit", "Kumar", 1500)
  val president = EmployeeRequest("POTC", "Aarush", "Kumar", 1500)

  val employee1 = EmployeeRequest("POT", "Aarush", "Kumar", 1500)

  println(EmployeeService.setEmp(consultant))
  println(EmployeeService.setEmp(manager))
  println(EmployeeService.setEmp(srManager))
  println(EmployeeService.setEmp(president))
  EmployeeService.setEmp(employee1)

  AttendanceService.getEmployeeAttendance(consultant, "09:50 AM", "06:50 PM")
  AttendanceService.getEmployeeAttendance(manager)
  AttendanceService.getEmployeeAttendance(srManager, "09:50 AM", "06:50 PM")
  AttendanceService.getEmployeeAttendance(president)

}
