package com.knoldus.service

import java.util.UUID

import com.knoldus._
object EmployeeService {

  def setEmp(emp: EmployeeRequest): Option[Employee] = {
    emp.prefix match {
      case "CONS" =>
        Some(
          Consultant(emp.prefix + "-" + UUID.randomUUID().toString,
                     emp.firstName,
                     emp.lastName,
                     emp.salary))
      case "MANA" =>
        Some(
          Manager(emp.prefix + "-" + UUID.randomUUID().toString,
                  emp.firstName,
                  emp.lastName,
                  emp.salary))
      case "SRMA" =>
        Some(
          SrManager(emp.prefix + "-" + UUID.randomUUID().toString,
                    emp.firstName,
                    emp.lastName,
                    emp.salary))
      case "POTC" =>
        Some(
          President(emp.prefix + "-" + UUID.randomUUID().toString,
                    emp.firstName,
                    emp.lastName,
                    emp.salary))
      case _ => None
    }

  }
}
