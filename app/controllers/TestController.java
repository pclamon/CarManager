package controllers;

import models.Test;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.util.List;

public class TestController extends Controller
{
    private FormFactory formFactory;
    private JPAApi db;

    @Inject
    public TestController(FormFactory formFactory, JPAApi db)
    {
        this.formFactory = formFactory;
        this.db = db;
    }

    public Result getTest()
    {
        return ok(views.html.test.render("Test Text"));
    }

    public Result postTest()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        String test = form.get("test");
        return ok(views.html.test.render(test));
    }

    @Transactional(readOnly = true)
    public Result getTestDb()
    {
        String sql = "SELECT t FROM Test t";
        TypedQuery query = db.em().createQuery(sql, Test.class);
        List<Test> test = query.getResultList();

        return ok(views.html.test.render("Rows: " + test.size()));
    }

    @Transactional
    public Result postTestDb()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        String testName = form.get("test");
        Test test = new Test();
        test.setTestName(testName);
        db.em().persist(test);

        return redirect("/testdb");
    }
}
