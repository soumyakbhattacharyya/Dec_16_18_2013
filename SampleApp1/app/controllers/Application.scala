package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def echo(name:String) = Action {
    Ok(views.html.echo(name))
    //Ok("Hello " + name)
  }
  def index = Action {
    //Redirect(routes.cars.list())
    Ok("Hello")
    //Ok(views.html.index("Your new application is ready."))
  }
  def login = Action {
    Ok("Login page")
  }

}