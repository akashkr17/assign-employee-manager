package com.knoldus

case class EmployeeRequest(prefix: String,
                           firstName: String,
                           lastName: String,
                           salary: Int)

case class Consultant(empId: String,
                      firstName: String,
                      lastName: String,
                      salary: Int)
    extends Employee

case class Manager(empId: String,
                   firstName: String,
                   lastName: String,
                   salary: Int)
    extends Employee

case class SrManager(empId: String,
                     firstName: String,
                     lastName: String,
                     salary: Int)
    extends Employee

case class President(empId: String,
                     firstName: String,
                     lastName: String,
                     salary: Int)
    extends Employee
