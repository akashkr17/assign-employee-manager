package com.knoldus.service

import java.time.format.DateTimeFormatter
import java.time.{LocalDate, LocalDateTime, ZoneId}

import com.knoldus.EmployeeRequest

object AttendanceService {

  /*
   * Method to use the provided time for employee attendance
   */
  def getEmployeeAttendance(emp: EmployeeRequest,
                            startTime: String,
                            endTime: String): Option[(String, String)] = {
    try {
      val startDateTime = getTime(startTime)
      val endDateTime = getTime(endTime)
      val employee = EmployeeService.setEmp(emp)
      println(
        s"Employee Attendance: Employee: $employee StartTime: $startDateTime , EndTime:  $endDateTime")

      Some((startDateTime, endDateTime))
    } catch {
      case ex: Exception =>
        ex.printStackTrace
        None
    }
  }
  /*
   * Method to use the default time for employee attendence
   */
  def getEmployeeAttendance(emp: EmployeeRequest): Option[(String, String)] = {
    try {
      val startDateTime = getTime("09:45 AM")
      val endDateTime = getTime("06:45 PM")
      val employee = EmployeeService.setEmp(emp)

      println(
        s"EmployeeAttendance: Employee: $employee   StartTime: $startDateTime , EndTime:  $endDateTime")
      Some((startDateTime, endDateTime))
    } catch {
      case ex: Exception =>
        ex.printStackTrace
        None
    }

  }
  /*
   * Method to format the time into a particular method
   */
  def getTime(time: String): String = {
    val formatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")
    val localDateTime =
      LocalDateTime.parse(LocalDate.now.toString + " " + time, formatter)
    val dateTime = localDateTime.format(formatter)

    /*
     * Use this offsetDateTime to get the UTC zone time
     */
    val offsetDateTime = localDateTime.atZone(ZoneId.of("UTC")).toOffsetDateTime

    dateTime
  }
}
