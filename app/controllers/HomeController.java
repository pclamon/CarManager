package controllers;

import play.mvc.*;
import views.html.*;

public class HomeController extends Controller
{
    public Result getHome()
    {
        return ok(views.html.home.render());
    }
}
