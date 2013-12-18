package controllers

import play.api._
import play.api.mvc._
import models.Car

object Cars extends Controller{
	
  def list = Action {
	  val cars = Car.findAll
	  Ok(views.html.cars.list(cars))
	}
}